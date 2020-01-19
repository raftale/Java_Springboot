package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/*
* SpringBoot 单元测试
* @RunWith(SpringRunner.class)  驱动器用sprongrunner的来跑，而不是junit
* 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {

	@Autowired
	Person person;

	@Autowired
    ApplicationContext ioc; //ioc容器  若报错

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

	@Test
	public void contextLoads() {
		System.out.println(person);
	}


}
