package springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
//		Triangle triangle = (Triangle)context.getBean("triangle");
//		triangle.draw();
		
		
//		traditional way
//		Point pointA = new Point();
//		pointA.setX(1);
//		pointA.setY(1);
		
//		Point pointA = (Point)context.getBean("zeroPoint");
//		Point pointB = (Point)context.getBean("point2");
//		Point pointC = (Point)context.getBean("point3");
//		Triangle triangle = new Triangle();
//		triangle.setPointA(pointA);
//		triangle.setPointB(pointB);
//		triangle.setPointC(pointC);
		
		//利用context这个bean factory来getBean
		
		//close the ApplicationContext when it is desktop application
		//change applicationContext into AbstractApplicationContext
		
		//context.registerShutdownHook();
//		Triangle triangle = (Triangle)context.getBean("triangle");
//		triangle.draw();
//		Circle circle = (Circle)context.getBean("circle");
//		circle.draw();
		//the shape interface only know it get a bean called circle
		//does not know create a triangle or circle, 只是针对于bean去做文章
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		System.out.println(context.getMessage("greeting", null, "default greeting", null));
	}

}
