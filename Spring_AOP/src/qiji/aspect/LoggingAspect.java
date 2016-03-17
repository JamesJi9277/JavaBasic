package qiji.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
	@Before("execution(* get*(..))") 
	public void loggingAdvice() {
		System.out.println("Advice run. Get Method called");
	}
}
