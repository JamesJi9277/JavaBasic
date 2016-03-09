package springDemo;
import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//如果需要得到triangle里面的相关内容的话
//就需要getApplicationContext
//首先需要implements ApplicationContextAware, BeanNameAware
//然后声明 
//private ApplicationContext context
//private String beanName
//再通过系统默认的setter方法得到他们的值，这样就得到了triangle这个class里面的值

//public class Triangle implements ApplicationContextAware, BeanNameAware{
//通过导入InitializingBean和DisposableBean来得到bean创建和销毁时候的信息
//public class Triangle implements InitializingBean, DisposableBean {
public class Triangle implements Shape {
//	private String type;
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//
//	//构建一个constructor，
//	//然后spring.xml里面的constructor-org的值就可以直接传到这里面
//	public Triangle(String type) {
//		this.type = type;
//	}
//	public Triangle(int height) {
//		this.height = height;
//	}
//	public Triangle(String type, int height) {
//		this.height = height;
//		this.type = type;
//	}
//	
//	
//	public String getType() {
//		return type;
//	}
//
////	public void setType(String type) {
////		this.type = type;
////	}
//
//	public void draw() {
//		System.out.println("Type is " + this.getType());
//		System.out.println("Height is "+ this.getHeight());
//	}
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context ;
	private String beanName;
	//private List<Point> points;
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



//	public List<Point> getPoints() {
//		return points;
//	}
//
//
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}


	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Three points are\n" + "(" + this.getPointA().getX() + "," + this.getPointA().getY() + ")"
				+ "  \n" + "(" + this.getPointB().getX() + "," + this.getPointB().getY()+ ")" 
				+"\n" + "(" + this.getPointC().getX() + "," + this.getPointC().getY()+ ")");
//	    for(Point point : points) {
//	    	System.out.print("(" + point.getX() + "," + point.getY() + ")" + "\n");
//	    }
	}
	
	public void myInit() {
		System.out.println("My init method called for Triangle");
	}

//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		// TODO Auto-generated method stub
//		this.context = context;
//	}



	//@Override
//	public void setBeanName(String beanName) {
//		// TODO Auto-generated method stub
//		this.beanName = beanName;
//		System.out.println("Bean name is: " + beanName + "\n" + "这里的beanName指的是bean起的ID名字" );
//	}



	
	//call back method
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("InitializingBean init method called for triangle");
//	}



	
	//call back method
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("bean has destroied");
//	}
	public void cleanUp() {
		System.out.println("cleaned");
	}
}
