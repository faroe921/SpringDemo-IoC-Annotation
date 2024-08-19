package com.fro.spring.test;

import com.fro.spring.config.SpringConfiguration;
import com.fro.spring.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:57
 * @Description: com.fro.spring.test
 * @version: 1.0
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserController bean = ac.getBean(UserController.class);
        bean.query();
    }
}
