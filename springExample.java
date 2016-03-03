drawing class
protected class Drawing {
	private Shape shape;

	public setShape(Shape shape) {
		this.shape = shape;
	}

	public drawShape() {
		this.shape.draw();
	}
}

different class

Triangle myTriangle = new Triangle();
drawing.setShape(myTrianglegle);
drawing.drawShape();