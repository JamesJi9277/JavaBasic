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
	    /*
	     * 先在spring.xml里面声明一个shapeService的bean
	     * 然后不用new，而是直接通过getBean声明一个新的类
	     * 之后因为在implement这个shapeService bean的时候，自动选择了
	     * autowired="byName"，就自动和triangle和circle匹配了*/
	    
	    //System.out.println(shapeService.getCircle().getName());//use this flow to write an aspect
	    //System.out.println(shapeService.getTriangle().getName());
	    shapeService.getCircle();//for test around advice
	    //shapeService.getCircle().setName("Circle77");//test PointCut
	    shapeService.test();
	}

}
