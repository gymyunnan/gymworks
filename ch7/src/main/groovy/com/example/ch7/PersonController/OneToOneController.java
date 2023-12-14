package com.example.ch7.PersonController;

import com.example.ch7.mapper.PersonMapper;
import com.example.ch7.pojo.Person;
import com.example.ch7.pojo.SelectPersonById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OneToOneController {
    @Autowired
    PersonMapper personMapper;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("selectPerson1")
    public String selectPerson1(@RequestParam("id") Integer id, Model model){
        Person p1 = personMapper.selectPersonById1(id);
        model.addAttribute("person", p1);
        return "show";
    }

    @RequestMapping("selectPerson2")
    public String selectPerson2(@RequestParam("id") Integer id, Model model){
        Person p1 = personMapper.selectPersonById2(id);
        model.addAttribute("person", p1);
        return "show";
    }

    @RequestMapping("selectPerson3")
    public String selectPerson3(@RequestParam("id") Integer id, Model model){
        SelectPersonById p1 = personMapper.selectPersonById3(id);
        model.addAttribute("person", p1);
        return "show1";
    }
}
