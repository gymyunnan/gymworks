package com.example.mybatis.controller;

import com.example.mybatis.pojo.MyApple;
import com.example.mybatis.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AppleController {

    @Autowired
    AppleService appleService;

    @RequestMapping("/apples/selectOneApple")
    public String selectOneApple(@RequestParam("id") Integer id, Model model) {
        MyApple apple = appleService.selectAppleById(id);
        model.addAttribute("apple", apple);
        return "selectOneAppleView";
    }

    @RequestMapping("/apples/selectAllApple")
    public String selectAllApple(Model model) {
        List<MyApple> apples = appleService.selectAllApple();
        model.addAttribute("apples", apples);
        return "selectAllAppleView";
    }

    @RequestMapping("/apples/deleteOneApple")
    public String deleteOneApple(@RequestParam("id") Integer id, Model model) {
        Integer num = appleService.deleteApple(id);
        model.addAttribute("num", num);
        return "deleteOneAppleView";
    }

    @RequestMapping("/apples/addOneApple")
    public String addMyApple(@RequestParam("name") String name, @RequestParam("color") String color, @RequestParam("price") double price, Model model) {
        MyApple apple = new MyApple();
        apple.setName(name);
        apple.setColor(color);
        apple.setPrice(price);
        apple.setTime(new Date());
        Integer num = appleService.addMyApple(apple);
        model.addAttribute("num", num);
        return "addOneAppleView";
    }

    @RequestMapping("/apples/updateOneApple")
    public String updateOneApple(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("color") String color, @RequestParam("price") double price, Model model) {
        MyApple apple = new MyApple();
        apple.setId(id);
        apple.setName(name);
        apple.setColor(color);
        apple.setPrice(price);
        Date currentTime = new Date();
        apple.setTime(currentTime);
        Integer num = appleService.updateApple(apple);
        model.addAttribute("num", num);
        return "updateOneAppleView";
    }

    @RequestMapping("/apples/selectLeastApple")
    public String selectLeastApple( Model model) {
        MyApple apple = appleService.selectLeast();
        model.addAttribute("apple", apple);
        return "selectLeastAppleView";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

/*    @RequestMapping("/selectOneApple")
    @ResponseBody
    public MyApple selectAppleById() {

        return appleService.selectAppleById(1);
    }*/
//
//    @RequestMapping("/selectAllApple")
//    public List<MyApple> selectAllApple() {
//        return appleService.selectAllApple();
//    }
//
//    @RequestMapping("/addMyApple")
//    public int addMyApple(MyApple apple) {
//        return appleService.addMyApple(apple);
//    }
//
//    @RequestMapping("/updateApple")
//    public int updateApple(MyApple apple){
//        return appleService.updateApple(apple);
//    }
//
//    @RequestMapping("/deleteApple")
//    public int deleteApple(Integer id){
//        return appleService.deleteApple(id);
//    }

}

