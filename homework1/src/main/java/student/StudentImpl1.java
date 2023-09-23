package student;

import book.Book;
import book.BookImpl;

public class StudentImpl1 implements Student {
	public String name;
	public String grade;
	public int age;
	public BookImpl book;

	@Override
	public String toString() {
		return "我的名字是:"+name+";年龄是:"+age+";我是"+grade+"的学生"+";我应该好好学习:"+book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBook(BookImpl book) {
		this.book = book;
	}
	
}
