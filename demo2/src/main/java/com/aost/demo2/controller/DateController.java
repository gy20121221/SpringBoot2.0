package com.aost.demo2.controller;

import com.aost.demo2.Date.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DateController {

        @Autowired
        Person person;

        @RequestMapping("/p")
        public Person person(){
            return person;
        }


}
