package com.aost.demo3.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PostController {


    @GetMapping("/car/{name}/owner/{id}")
    public Map<String,Object> getMap(@PathVariable("name") String name,
                                     @PathVariable("id") Integer id,
                                     @PathVariable HashMap<String,String> hashMap,
                                     @RequestHeader("Host") String host,
                                     @RequestHeader Map<String,String> rmap,
                                     @RequestParam("age") String age,
                                     @RequestParam Map<String,String> pmap,
                                     @CookieValue("remember-me") String rememberMe,
                                     @CookieValue("remember-me") Cookie cookie){
        HashMap<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("id",id);
        map.put("hashMap",hashMap);
        map.put("host",host);
        map.put("rmap",rmap);
        map.put("age",age);
        map.put("pmap",pmap);
        map.put("remember-me",rememberMe);
        System.out.println(cookie.getName()+cookie.getValue()+cookie.getPath());
        return map;
    }

    @PostMapping("/save")
    public Map<String,Object> save(@RequestBody String s){
        HashMap<String,Object> map=new HashMap<>();
        map.put("s",s);
        return map;
    }

}
