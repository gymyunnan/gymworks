package book;

public class BookImpl implements Book{
	public String name;

	public BookImpl(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
