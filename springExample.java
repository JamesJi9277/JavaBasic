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

//更新一下
//separting the dependency out of the whole class
//跟interface很类似，当drawing的对象或者形状更换了的时候，drawing class不需要更改任何一行代码
//只需要知道自己干的活是setter和drawing就够了
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
Drawing drawing = new Drawing();
Triangle myTriangle = new Triangle();
drawing.setShape(myTraingle);
drawing.drawShape();

different class

Triangle myTriangle = new Triangle();
drawing.setShape(myTrianglegle);
drawing.drawShape();