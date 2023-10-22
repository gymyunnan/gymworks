package dao;

import java.util.Random;

import org.springframework.stereotype.Repository;

import domain.Apple;

@Repository("appleDao")
public class AppleDaoImpl {
	
	Random numList = new Random();
	
	public Apple generateApple() {
		float price = numList.nextFloat()*7+3;
		float weigh = numList.nextFloat()*200+100;
		return new Apple(price, weigh);
	}
	
	public Apple getApple() {
		Apple apple = generateApple();
		return apple;
	}
}
