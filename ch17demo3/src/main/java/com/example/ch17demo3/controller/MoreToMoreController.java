package com.example.ch17demo3.controller;

import com.example.ch17demo3.mapper.OrderMapper;
import com.example.ch17demo3.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MoreToMoreController {
    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("selectOrder")
    public String selectOrder (Model model){
        List<Orders> os = orderMapper.selectallOrdersAndProducts();
        model.addAttribute("orders", os);
        return "show";
    }
}
