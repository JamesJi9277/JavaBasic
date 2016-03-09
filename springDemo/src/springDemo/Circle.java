package springDemo;

public class Circle implements Shape{
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawed");
		System.out.println("Center Point is " + "(" + center.getX() + "," + center.getY() + ")");
	}
	
}
