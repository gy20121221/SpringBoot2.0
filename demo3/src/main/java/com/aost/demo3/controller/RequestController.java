package com.aost.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/gotoS")
    public String toSe(HttpServletRequest request){
        request.setAttribute("msg","转发成功");
        request.setAttribute("id",18);

        return "forward:/s";
    }

    @ResponseBody
    @GetMapping("/s")
    public Map s(@RequestAttribute String msg,
                 @RequestAttribute Integer id,
                 HttpServletRequest request ){
        HashMap<String,Object> map=new HashMap<>();
        Object msg1 = request.getAttribute("msg");
        map.put("msg",msg);
        map.put("id",id);
        map.put("msg1",msg1);
        return map;
    }
}
