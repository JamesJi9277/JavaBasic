package springDemo;

import org.springframework.context.ApplicationEvent;

//想要在draw里面添加event需要两个步骤，第一个是自己建一个drawEvent class,第二个是讲这个event publish到类的方法中
public class drawEvent extends ApplicationEvent{

	public drawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	@Override
	//override toString() method
	public String toString() {
		return "Draw Event Occured";
	}
}
