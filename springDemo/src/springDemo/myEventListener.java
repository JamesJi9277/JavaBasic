package springDemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//needs to implement application listener interface
@Component
//需要在spring.xml里面去注册这个bean，所以需要添加component这个annotation

public class myEventListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		//这段代码需要执行的是所有的event在这个spring framework里面执行的
		System.out.println("Event is : " + event.toString());
	}

}
