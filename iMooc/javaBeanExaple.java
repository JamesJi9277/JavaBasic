1.public 类
2.private属性
3.不含参数的构造函数
4.getter和setter方法

public class student {
	private int age;
	private String name;
	public student() {

	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}