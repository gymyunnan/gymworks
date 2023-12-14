package Class;

import java.util.Enumeration;
import java.util.Vector;

public class BookNameList {
	private Vector<String> vector;
	private Enumeration bookenum;
	
	public BookNameList() {
		this.vector = new Vector<String>();
	}
	
	public void setBookName() {
		vector.add("Java 程序设计");
		vector.add("J2ME 程序设计");
		vector.add("XML 程序设计");
		vector.add("JSP 程序设计");
	}
	
	public Enumeration getEnumeration() {
		return vector.elements();
	}

}
