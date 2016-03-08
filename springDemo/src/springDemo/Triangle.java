package springDemo;
import java.util.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements ApplicationContextAware, BeanNameAware{
//	private String type;
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
//
//	//构建一个constructor，
//	//然后spring.xml里面的constructor-org的值就可以直接传到这里面
//	public Triangle(String type) {
//		this.type = type;
//	}
//	public Triangle(int height) {
//		this.height = height;
//	}
//	public Triangle(String type, int height) {
//		this.height = height;
//		this.type = type;
//	}
//	
//	
//	public String getType() {
//		return type;
//	}
//
////	public void setType(String type) {
////		this.type = type;
////	}
//
//	public void draw() {
//		System.out.println("Type is " + this.getType());
//		System.out.println("Height is "+ this.getHeight());
//	}
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	private String beanName;
	//private List<Point> points;
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



//	public List<Point> getPoints() {
//		return points;
//	}
//
//
//	public void setPoints(List<Point> points) {
//		this.points = points;
//	}


	public void draw() {
		System.out.println("Three points are\n" + "(" + this.getPointA().getX() + "," + this.getPointA().getY() + ")"
				+ "  \n" + "(" + this.getPointB().getX() + "," + this.getPointB().getY()+ ")" 
				+"\n" + "(" + this.getPointC().getX() + "," + this.getPointC().getY()+ ")");
//	    for(Point point : points) {
//	    	System.out.print("(" + point.getX() + "," + point.getY() + ")" + "\n");
//	    }
	}



	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}



	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
		System.out.println("Bean name is: " + beanName + "\n" + "这里的beanName指的是bean起的ID名字" );
	}
}
