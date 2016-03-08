package springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle2");
		triangle.draw();
	}

}
