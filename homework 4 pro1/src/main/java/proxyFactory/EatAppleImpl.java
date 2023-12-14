package proxyFactory;

import org.springframework.stereotype.Repository;

import annotation.TestApple;

@Repository("eatAppleImpl")
public class EatAppleImpl implements EatApple {

	@Override
	@TestApple
	public void eatAppleRaw() {
		System.out.println("生吃苹果");
	}

	@Override
	@TestApple
	public void eatAppleCooked() {
		System.out.println("蒸熟了吃苹果");
	}
	
}
