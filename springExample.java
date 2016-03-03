原始方法
新建两个类，一个是triangle一个是circle
Triangle myTriangle = new Triangle();
myTriangle.draw();

Circle myCircle = new Circle();
myCircle.draw();

using polymorphism
新建一个shape interface或者abstract class，circle和triangle两个类要去
override   shape里面的draw方法
//using polymorphism concept instead of calling teh method of object itself
Shape shape = new Triangle();
shape.draw();//draw a triangle

Shape shape = new Circle();
shape.draw();//draw a circle

method parameter

public void myDrawMethod(Shape shape) {
	shape.draw();
}
Shape shape = new Triangle();
shape.myDrawMethod();


class member variable
 using a drawing class
 //define a public setter
protected class Drawing {
	private Shape shape;
	//define a setter method
	public setShape(Shape shape) {
		this.shape = shape;
	}
	public void drawShape() {
		this.shape.draw();
	}
}


different class

Triangle myTriangle = new Triangle();
drawing.setShape(myTrianglegle);
drawing.drawShape();