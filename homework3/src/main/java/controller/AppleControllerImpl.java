package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import domain.Apple;
import service.AppleServiceImpl;

@Controller
public class AppleControllerImpl {
	
	@Autowired
	private AppleServiceImpl appleService;
	
	@RequestMapping("/seek1")
	public ModelAndView  printApple() {
		Apple apple = appleService.getApple();
		ModelAndView mv = new ModelAndView("seek", "myname","gym");
		mv.addObject("myapple", apple);
		return mv;
	}
	
}
