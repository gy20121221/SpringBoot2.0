package com.example.demo1.controlle;

import com.example.demo1.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    Car car;


    @RequestMapping("car")
    public Car getCar() {
        return car;
    }

    @RequestMapping("/hello")
    public String pull01(){
        return "hello world!";
    }
}
