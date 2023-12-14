package Class;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Iterator{
	Enumeration bookneum;

	public IteratorAdapter(Enumeration bookneum) {
		this.bookneum = bookneum;
	}
	
	public boolean hasNext() {
		return bookneum.hasMoreElements();
	}
	
	public Object next() {
		return bookneum.nextElement();
	}
	
	public void remove() {
		System.out.println("枚举器没有删除集合元素的方法");
	}
	
}
