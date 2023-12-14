package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dao.AppleDao;
import po.Apple;

@Controller("appleController")
public class AppleController {
	@Autowired
	private AppleDao appleDao;
	
	public void test() {
		//查询一个苹果
		Apple apple = appleDao.selectAppleById(1);
		System.out.println(apple);
		
		//添加一个苹果
		Apple pinkApple = new Apple();
		pinkApple.setColor("pink");
		pinkApple.setName("pinkApple");
		pinkApple.setPrice(15.0);
		int addNum = appleDao.addApple(pinkApple);
		System.out.println("添加了"+addNum+"条记录");
		
		//修改苹果
		Apple blueApple = new Apple();
		pinkApple.setColor("blue");
		pinkApple.setName("blueApple");
		pinkApple.setPrice(12.0);
		int upNum = appleDao.updateApple(blueApple);
		System.out.println("修改了"+upNum+"条记录");
		
		//删除苹果
		int delNum = appleDao.deleteApple(4);
		System.out.println("删除了"+delNum+"条记录");
		
		//查询所有苹果
		List<Apple> list = appleDao.selectAllApple();
		for (Apple apple2 : list) {
			System.out.println(apple2);
		}
	}
}
