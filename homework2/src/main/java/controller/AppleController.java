package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import service.AppleServiceImpl;

//@Controller("appleController")
public class AppleController {
	
//	@Autowired
//	@Qualifier("appleServiceImpl")
	public AppleServiceImpl appleService;

	
	public AppleServiceImpl getAppleService() {
		return appleService;
	}


	public void setAppleService(AppleServiceImpl appleService) {
		this.appleService = appleService;
	}


	public void printApple() {
		String json = appleService.getApples();
		System.out.println(json);
	}
}
