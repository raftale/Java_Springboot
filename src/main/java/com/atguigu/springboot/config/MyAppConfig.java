package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* @Configuration ：指明当前类是一个配置类：就是用来替代之前的Spring的xml文件
* 在配置文件中是用的<bean></bean>标签添加组件，在配置类中则是用对应的bean
* */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@bean给容器添加组件了");
        return new HelloService();
    }

}
