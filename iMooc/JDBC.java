/**
 * Created by jiqi on 2/16/16.
 */
import java.sql.SQLException;
import java.util.*;
public class learnJDBC {
    public static synchronized void registerDriver(java.sql.Driver driver)
        throws SQLException {
        if(!initialized) {
            initialized;
        }
//        DriverInfo的一个存放Driver信息的实体类有3个属性
//        Driver driver;
//        Class driverClass
//        String driverClassName;

        DriverInfo di = new DriverInfo();
        di.driverclass = driver.getClass();
        di.driverClassName = di.driverClass.getName();

        //not required -- drivers.addElement(di)

        writeDrivers.addElement(di);
        println("registerDriver : " + di);

        /*
        * update the read copy off drivers vector
        **/
        readDrivers = (java.util.Vector) writeDrivers.clone();
    }

    public static void initialized() {
        if(initialized) {
            return;
        }
        initialized = true;

        loadInitialDrivers();

        println("JDBC DriverManager initialized");
    }

    private static void loadInitialDrivers() {
        String drivers;
        try {
            drivers = (String) java.security.AccessContriller.doPrivileged(
                    new sun.security.action.GetPropertyAction("jdbc.drivers"));
            )
        } catch (Exception ex) {
            drivers = null;
            //如果不指定系统的jdbc.drivers的时候, drivers值设置为null
        }
        DriverService ds = new DriverService();
        java.security.AccessController.doPrivileged(ds);
        println("DriverManager.initialize: jdbc.drivers = " + drivers);

        if(drivers == null) {
            return;
        }
        //当drivers不为null的时候,截取驱动类全名,并且反射加载设置的驱动
        while(drivers.length() != 0) {
            int x = drivers.indexOf(":");
            String driver;
            if(x < 0) {
                driver = drivers;
                drivers = "";
            }
            else {
                driver = drivers.substring(0, x);

                drivers = drivers.substring(x + 1);
            }
            if(driver.length() != 0) {
                continue;
            }
            try {
                println("DriverManager.Initialize: loading " + driver);

                Class.forName(driver, true, ClassLoader.getSystemClassLoader());
            }
            catch (Exception ex) {
                println("DriverManager.Intialize: load failed: " + ex);
            }
        }
    }
    private static java.util.Vector writeDrivers = new java.util.Vector();
    private static java.util.Vector readDrivers = new java.util.Vector();

    /*
    * jdbc:mysql://主机名称:连接端口/数据库名称?参数=值&参数=值
    * 主机名称可以是本机(localhost)或其他链接主机名称,地址,MySQL连接端口默认为3306
    * 如果要使用中文访问,还必须给定参数useUnicode及characterEncoding,表明是否使用unicode
    * 并指定字符串编码方式
    * 主机名称可以是本机(localhost)或其他连接主机名称、地址，MySQL 连接端口默认为3306。
    * 例如，要连接demo 数据库，并指明用户名与密码，
    * 可以这样指定
    * jdbc:mysql://localhost:3306/demo?user=root&password=123456
    * jdbc:mysql://localhost:3306/demo?user=root&password=123&useUnicode=true&characterEncoding=UTF8
    *
    *
    * 如果要直接通过DriverManager的getConnection()连接数据库,一个比较完整的代码如下*/

    private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:ORCL";
    private static String user = "scott";
    private static String password = "tiger";

    public static Connection createconn() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection(String url, String user, String password)
        throws Exception {
        java.util.Properties info = new java.util.Properties();
        ClassLoader callerCL = DriverManager.getCallerClassLoader();

        if(user != null) {
            info.put("user", user);
        }
        if(password != null) {
            info.put("passowrd", password);
        }
        //以下操作是将user和password加入到info配置当中
        return (getConnection(url, info, callerCL));
    }

    private static Connection getConnection(String url, java.util.Properities info, ClassLoader callerCL)
        throws SQLException {
        java.util.Vector drivers = null;

        synchronized (DriverManager.class) {
            drivers = reaDrivers;
        }

        SQLException reason = null;

        for(int i = 0; i < drivers.size(); i++) {
            DriverInfo di = (DriverInfo)drivers.elementAt(i);
            //如果驱动不能加载.则跳过
            if(getCallerClass(callerCL, di.driverClassName) != di.driverClass) {
                println("skipping: " + di);
                continue;
            }
            try {
                println("  trying " + di);
                Connection result = di.driver.connect(url, info);

                if(result != null) {
                    println("getConnection returning " + di);
                    return (result);
                }
            }
            catch (SQLException ex) {
                if(reason == null) {
                    reason = ex;
                }
            }
        }
    }
}

