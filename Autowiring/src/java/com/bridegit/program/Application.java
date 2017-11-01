package com.bridegit.program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
public class Application {
	public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
        bean.sayHello("Spring 4");
        context.close();
    }
}
