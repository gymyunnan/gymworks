package animal;

public class Dog {
	private String name;
	private int age;
	public String hobby;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public String info(){
		return "小狗爱吃骨头！！";
	}
	
	class Bird{}
	
	class Cat{}
}


