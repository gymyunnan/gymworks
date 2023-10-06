package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import domain.Apple;

//@Repository("appleDaoImpl")
public class AppleDaoImpl {
	
	Random numList = new Random();
	
	public Apple generateApple() {
		
		float price = numList.nextFloat()*7+3;
		float weight = numList.nextFloat()*200+100;
		String[] tastes = {"酸", "苦","甜","辣","咸"};
		String taste = tastes[numList.nextInt(tastes.length)];
		return new Apple(price, weight, taste);
		
	}
	
	public List<Apple> getApples(){
		List<Apple> Apples = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Apples.add(generateApple());
		}
		return Apples;
	}
}
