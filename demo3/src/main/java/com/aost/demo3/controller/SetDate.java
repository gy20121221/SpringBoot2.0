package com.aost.demo3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SetDate {


//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser(){
        return "GET-张三";
    }

 //       @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser(){
        return "POST-张三";
    }


   //     @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser(){

        return "PUT-张三";
    }

    @DeleteMapping("/user")
 //  @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

    //扩展点：如何把 _method 这个名字换成我们自己喜欢的


}
