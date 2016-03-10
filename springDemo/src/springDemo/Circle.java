package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	private Point center;
	
	public Point getCenter() {
		return center;
	}
//	@Required
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="pointA")
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
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawed");
		System.out.println("Center Point is " + "(" + center.getX() + "," + center.getY() + ")");
	}
	
}
