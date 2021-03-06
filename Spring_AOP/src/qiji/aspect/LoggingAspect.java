package qiji.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import qiji.model.Circle;

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
	//@Before("allGetters() && allCircleGetters()") 
	@Before("allCircleGetters()") 
	//这个代表需要用时满足两个条件才能够执行这个logging advice语句
	public void loggingAdvice(JoinPoint joinPoint) {
		//can use joinPoint to get information that trigger the below function
		//如果我只需要allCircleGetters。那么不管是getter还是setter我都会print
		//如果用到了joinPoint就可以避免这个问题
		//give us what method that triggered the advice
		System.out.println(joinPoint.getTarget());
		//可以这么使用
		//Circle circle = (Circle) joinPoint.getTarget();
	}
	//@Before和@After用法一样，同理
	//@AfterReturning("args(time)")//或者name都可以。不管是什么就仅仅是一个名字而已在后面又说name，只要对应就行
	@Before("args(time)")
	//this argument only runs when a string is used as an argument
	//在AppMain中我用了一个getCircle.setName()，就行当予传了一个string参数进来
	//所以这个@Before会检测到，会进行输出，同时也会有一个setter函数，所以同样也会print一个事件
	public void stringArgumentMethods(String time) {
		System.out.println(time + "  A method that takes String arguments has been called");
	}
	
	
	//Around Advice, means thia methods willrun around the allCircleGetters method
	//@Around("allCircleGetters()")
	@Around("@annotation(qiji.aspect.Loggable)")
	/*
	 * 这样相当于是对全局的一个定义，注册一个annotation文件再用
	 * @annotation(qiji.aspect.Loggable)去注册
	 * 这样我无论在哪里只要在函数之前去添加这个annotation那么就可以找到这个定义
	 * 跟class的定义差不多
	 */
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		/*
		 * 当里面的proceedingJoinPoint.proceed() run的时候
		 * 在他前面的部分会先run
		 * 在他后面的部分也会run
		 * 这就是around advice*/
		Object returnValue = null;
		try {
			System.out.println("Before Advice");
			//这前面的都是before advice
			returnValue = proceedingJoinPoint.proceed();
			/*
			 * if the proceed function return a value
			 * then we need to modify void to Object to fit all situation
			 */
			//这个后面的都是after advice
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}//this will execute around the advice that is advicing
		
		System.out.println("After Finally");
		return returnValue;
	}
	
	
//	@AfterThrowing("args(name)")
//	public void exceptionAdvice(String name) {
//		System.out.println("An exception has been thrown");
//	}
//	@Before("allGetters()") 
//	public void secondAdvice() {
//		System.out.println("Second Advice run. Get Method called");
//	}
//	//如果有很多这样需要去用到before annotation的，并且结构都相似，那么可以用Pointcut
//	
//	@Pointcut("execution(* get*(..))")
//	public void allGetters() {
//		//allGetters is a dummy method, it holds a Pointcut expression
//	}
	//@Pointcut("execution(* qiji.service.*.*(..))")//all methods within this package
	@Pointcut("within(qiji.model.Circle)")//more readable,all method within this class
	//@Pointcut("within(qiji.model.Circle)")代表只跟Circle有关
	//只要检测到circle里面发声的时间或者是circle里面函数被call了，就会print事件名
	public void allCircleGetters() {
		
	}
	//can combine all getters and all setters
	//@Pointcut(args())
	
}
