package com.example.demo1.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {



    @RequestMapping("/hello")
    public String pull01(@RequestParam(value = "name") String name){
        return "hello world!"+name;
    }
}
