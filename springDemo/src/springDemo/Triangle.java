package springDemo;

public class Triangle {
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	//构建一个constructor，
	//然后spring.xml里面的constructor-org的值就可以直接传到这里面
	public Triangle(String type) {
		this.type = type;
	}
	public Triangle(String type, int height) {
		this.height = height;
		this.type = type;
	}
	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

	public void draw() {
		System.out.println(this.getType() + "三角形\n画好了 " );
	}
}
