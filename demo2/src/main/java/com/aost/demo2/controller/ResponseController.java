package com.aost.demo2.controller;

import com.aost.demo2.Date.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ResponseController {


    @ResponseBody
    @GetMapping("/test/person")
    public Person getPersonJson(){
        Person person=new Person();
        person.setAge(18);
        person.setBirth(new Date());
        person.setUserName("lbw");
        return person;
    }
}
