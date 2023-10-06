package annotation2.controller;

import annotation2.service.TestService;

public class TestController {
	
	TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public void save() {
		testService.save();
		
	}
}
