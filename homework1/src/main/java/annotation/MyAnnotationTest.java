package annotation;

public class MyAnnotationTest {
	
	@user(name = "小红", age = 19)
	public void message() {
		System.out.println("啦啦啦啦啦");
	}
	
	@user
	public void info() {
		System.out.println("啊啊啊啊啊");
	}
	
	public void ask() {
		System.out.println("寻求帮助！！！");
	}
}
