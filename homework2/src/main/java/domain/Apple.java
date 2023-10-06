package domain;

public class Apple {
	
	public float price;
	public float weight;
	public String taste;
	
	public Apple(float price, float weight, String taste) {
		super();
		this.price = price;
		this.weight = weight;
		this.taste = taste;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}
