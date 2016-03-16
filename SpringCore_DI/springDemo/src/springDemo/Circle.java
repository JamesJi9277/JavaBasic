package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Required;
//@Component
//@Service
//@Repository
//for data object
@Controller
//跟MVC相关，利用到MVC可以用到这个

//<context:component-scan base-package="springDemo" />
//搭配这个xml语句来使用
//这个Component的annotation的作用跟在spring.xml里面声明一个circle bean是一样的，
//前提是已经有其他的annotation进行一些属性的注入，比如说property还有center
public class Circle implements Shape, ApplicationEventPublisherAware{
	private Point center;
	
	private ApplicationEventPublisher publisher;
	//after declared, also need spring to have getter and setter to find the right publisher
	
	@Autowired
	private MessageSource messagesource;
	
	
	public MessageSource getMessagesource() {
		return messagesource;
	}
	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}
	public Point getCenter() {
		return center;
	}
//	@Required
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="pointB")
	//resource can do a dependency injection by name
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of circle");
	}
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(this.messagesource.getMessage("draw.Circle", null, "default drawing messages", null));
		System.out.println(this.messagesource.getMessage("draw.Point", new Object[] {center.getX(), center.getY()}, "default point messages", null));
		// System.out.println("Center Point is " + "(" + center.getX() + "," + center.getY() + ")");
	    System.out.println(this.messagesource.getMessage("greeting", null, "default greeting", null));
	    
	    //in order to publish an event, we need an event publisher
	    drawEvent drawEvent = new drawEvent(this);
	    //this means this class
	    publisher.publishEvent(drawEvent);
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
	
}
