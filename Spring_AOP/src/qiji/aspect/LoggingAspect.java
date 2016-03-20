package qiji.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//write logging method
	
	//不管是哪个class，triangle或者circle都可以，只针对这个函数
	//同时也是可以有一个针对，只针对于哪个class的哪个函数
	//或者用通配符匹配 Wildcard matching
	
//	@Before("execution(public String qiji.model.Circle.getName())") 
//	public void loggingAdvice() {
//		System.out.println("Advice run. Get Method called");
//	}
//	
//	@Before("execution(public String qiji.model.Triangle.getName())") 
//	public void loggingAdvice1() {
//		System.out.println("Advice run. Get Method called");
//	}
	
	//如果想把这个aspect应用到所有getter之前，不管是getName或者getAge。就需要用到wildcard
	//因为我存在着getCircle返回的是一个circle，所以我在返回的类型上一样要设置成*
	//如果对于函数里面的参数，arguments，不能够用*，因为*代表一定有东西，这样就忽略了没有arguments的情况
	//所以这个时候需要用..来代替，..的意思是既可以是任意字符又可以是什么都没有
	@Before("allGetters() && allCircleGetters()") 
	//这个代表需要用时满足两个条件才能够执行这个logging advice语句
	public void loggingAdvice(JoinPoint joinPoint) {
		//can use joinPoint to get information that trigger the below function
		//如果我只需要allCircleGetters。那么不管是getter还是setter我都会print
		//如果用到了joinPoint就可以避免这个问题
		System.out.println("Advice run. Get Method called");
	}
	@Before("allGetters()") 
	public void secondAdvice() {
		System.out.println("Second Advice run. Get Method called");
	}
	//如果有很多这样需要去用到before annotation的，并且结构都相似，那么可以用Pointcut
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		//allGetters is a dummy method, it holds a Pointcut expression
	}
	@Pointcut("within(qiji.model..*)")//more readable,all method within this class
	//@Pointcut("within(qiji.model.Circle)")代表只跟Circle有关
	public void allCircleGetters() {
		
	}
	//can combine all getters and all setters
	//@Pointcut(args())
}
