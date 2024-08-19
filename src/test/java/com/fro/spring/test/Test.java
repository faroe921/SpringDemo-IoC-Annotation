package com.fro.spring.test;

import com.fro.spring.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:32
 * @Description: com.fro.spring.test
 * @version: 1.0
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController bean = ac.getBean(UserController.class);
        bean.query();
    }
}
