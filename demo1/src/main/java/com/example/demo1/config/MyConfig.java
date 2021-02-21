package com.example.demo1.config;

import ch.qos.logback.classic.db.DBHelper;
import com.example.demo1.bean.Pet;
import com.example.demo1.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DBHelper.class)//使用import导入组件
@Configuration//注释这是个配置类
public class MyConfig {

    @Bean
    public Pet pet1(){
        return new Pet("mao");
    }

    @Bean("user")
    public User user1(){
        return new User("aost",18);
    }

}
/*
 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式

 配置 类组件之间无依赖关系用Lite模式加速容器启动过程，减少判断
配置类组件之间有依赖关系，方法会被调用得到之前单实例组件，用Full模式
* */
