package controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



import entity.Apple;

@Controller
@RequestMapping("/myapple")
public class AppleController {

	@RequestMapping("/apple")
	public ModelAndView appleRequest() {
		ModelAndView mv = new ModelAndView("/WEB-INF/jsp/applerequset.jsp");
		Apple apple1 = new Apple();
		apple1.setAppleName("BlueApple");
		apple1.setApplePrice(50);
		mv.addObject("myapple", apple1);
		return mv;
	}
	
	@RequestMapping("/getApple")
	@ResponseBody 
	//@ResponseBody作用与方法，它的作用其实是将java对象转为json格式的数据
	//在使用此注解之后不会再走视图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据。
	public Apple getApple() {
		Apple apple = new Apple();
		apple.setApplePrice(90);
		apple.setAppleName("RedApple");
		return apple;
	}
	
	@RequestMapping("/getApple2")
	@ResponseBody
	//@ResponseBody作用与方法，它的作用其实是将java对象转为json格式的数据
	//在使用此注解之后不会再走视图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据。
	public Apple getApple2() {
		
		Apple apple2 = getApple();
		apple2.setApplePrice(100);
		apple2.setAppleName("GrennApple");
		return apple2;
	}
}
