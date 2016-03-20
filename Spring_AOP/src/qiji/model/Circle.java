package qiji.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter called");
		//执行后的结果会有两个Circle's setter called
		//第一个是在声明circle bean的时候直接对circle进行的name赋值
		//另外一个是AppMain里面的setter函数
		//throw(new RuntimeException());
	}
	
//	public String setNameandReturn(String name) {
//		this.name = name;
//		System.out.println("Circle's setter called");
//		return name;
//	}
}
