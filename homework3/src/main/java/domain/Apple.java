package domain;

public class Apple {
	private float price;
	private float weight;
	
	public float getPrice() {
		return price;
	}
	
	public Apple(float price, float weight) {
		super();
		this.price = price;
		this.weight = weight;
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

	@Override
	public String toString() {
		return "my apple [price=" + price + ", weight=" + weight + "]";
	}
	
	
}
