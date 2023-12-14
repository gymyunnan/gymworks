package com.example.demo.controller;

import com.example.demo.dao.SelectUserOrdersById;
import com.example.demo.mapper.UserMapper;
import com.example.demo.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OneToMoreController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("selectPerson1")
    public String selectPerson1(@RequestParam("id") Integer id, Model model){
        User u1 = userMapper.selectUserOrdersById1(id);
        model.addAttribute("person", u1);
        return "show";
    }

    @RequestMapping("selectPerson2")
    public String selectPerson2(@RequestParam("id") Integer id, Model model){
        User u1 = userMapper.selectUserOrdersById2(id);
        model.addAttribute("person", u1);
        return "show";
    }

    @RequestMapping("selectPerson3")
    public String selectPerson3(@RequestParam("id") Integer id, Model model){
        List<SelectUserOrdersById> u1 = userMapper.selectUserOrdersById3(id);
        model.addAttribute("person", u1);
        return "show1";
    }
}
