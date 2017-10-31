package com.bridegit.ByName;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
 
        //autowire=byName 
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : "+application);
    }
}
