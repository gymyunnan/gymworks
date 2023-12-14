package com.example.ch4.controller;

import com.example.ch4.pojo.Apple;
import com.example.ch4.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppleController {

    @Autowired
    AppleService appleService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/addApple")
    public String addApple(@RequestParam("weight") double weight, @RequestParam("price") double price, Model model){
        int count = appleService.getAppleCount();
        Apple apple = new Apple();
        apple.setId(count+1);
        apple.setPrice(price);
        apple.setWeight(weight);
        Integer num = appleService.addApple(apple);
        model.addAttribute("num", num);
        return "addAppleView";
    }
}
