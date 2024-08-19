package com.fro.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Nino
 * @Date: 2024/8/19 - 08 - 19 - 下午11:53
 * @Description: com.fro.spring.config
 * @version: 1.0
 */
@Configuration//加了这个注解,我们的这个配置类就相当于替换了applicationContext.xml配置文件
@ComponentScan(basePackages = "com.fro.spring.*")
public class SpringConfiguration {
}
