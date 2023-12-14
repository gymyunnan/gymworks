package jdkproxy;

import org.springframework.stereotype.Repository;

@Repository("eatAppleImpl")
public class EatAppleImpl implements EatApple {

	@Override
	public void eatAppleRaw() {
		System.out.println("生吃苹果");
	}

	@Override
	public void eatAppleCooked() {
		System.out.println("蒸熟了吃苹果");
	}
}
