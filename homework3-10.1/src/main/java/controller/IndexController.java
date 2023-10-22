package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/index")
public class IndexController {
	@RequestMapping("/login")
	public String login(HttpSession session, HttpServletRequest request) {
		session.setAttribute("skey", "session的值");
		request.setAttribute("rkey", "request的值");
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("success","注册成功！！");
		return "register";
	}
}
