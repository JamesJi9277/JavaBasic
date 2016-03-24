package qiji.service;

import qiji.aspect.Loggable;
import qiji.model.Circle;
import qiji.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
		System.out.println("A circle is get");
		return circle;
	}
	@Loggable
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	@Loggable
	public void test() {
		System.out.println("This is a loggable test");
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
}
