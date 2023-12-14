package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.AppleDao;
import com.po.Apple;

@Controller
public class AppleConter {
	@Autowired
	private AppleDao appleDao;
	
	@RequestMapping("/select")
	public String select(Apple apple, Model model) {
		List<Apple> list = appleDao.selectAppleByName(apple);
		model.addAttribute("appleList", list);
		return "appleList";
	}
}
