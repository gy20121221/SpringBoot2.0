package com.aost.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/gotoS")
    public String toSe(HttpServletRequest request){
        request.setAttribute("msg","转发成功");
        request.setAttribute("id",18);
        request.setAttribute("name","ao");

        return "forward:/s";
    }

    @ResponseBody
    @GetMapping("/s")
    public Map s(@RequestAttribute String msg,
                 @RequestAttribute Integer id,
                 HttpServletRequest request ){
        HashMap<String,Object> map=new HashMap<>();
        Object msg1 = request.getAttribute("msg");
        Object msg2 = request.getAttribute("name");
        map.put("msg",msg);
        map.put("id",id);
        map.put("msg1",msg1);
        map.put("msg2",msg2);
        return map;
    }



    @GetMapping("/params")
    public String testParam(Map<String,Object> map,
                            Model model,
                            HttpServletRequest request,
                            HttpServletResponse response){
        map.put("hello","world666");
        model.addAttribute("world","hello666");
        request.setAttribute("message","HelloWorld");

        Cookie cookie = new Cookie("c1","v1");
        response.addCookie(cookie);
        return "forward:/success";
    }


    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute(value = "msg",required = false) String msg,
                       @RequestAttribute(value = "code",required = false)Integer code,
                       HttpServletRequest request){
        Object msg1 = request.getAttribute("msg");

        Map<String,Object> map = new HashMap<>();
        Object hello = request.getAttribute("hello");
        Object world = request.getAttribute("world");
        Object message = request.getAttribute("message");

        map.put("reqMethod_msg",msg1);
        map.put("annotation_msg",msg);
        map.put("hello",hello);
        map.put("world",world);
        map.put("message",message);

        return map;

    }



}
