package Class;

import java.util.Iterator;
import java.util.LinkedList;

public class NewBookNameList {
	LinkedList<String> bookList;
	Iterator iterator;
	
	public NewBookNameList(Iterator iterator) {
		bookList = new LinkedList<String>();
		this.iterator = iterator;
	}
	
	public void setBookName() {
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			bookList.add(name);
		}
	}
	
	public void getBookName() {
		Iterator<String>iter = bookList.iterator();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			System.out.println(name);
		}
	}
	
}
