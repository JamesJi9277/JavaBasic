package qiji;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import qiji.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//get the shapeService this bean, and this bean is belong to the following class
	    ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
	    System.out.println(shapeService.getCircle().getName());
	}

}
