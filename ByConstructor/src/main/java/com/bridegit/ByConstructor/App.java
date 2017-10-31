package com.bridegit.ByConstructor;

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
 
        //autowire=constructor
        Performer performer = (Performer)context.getBean("performer");
        System.out.println("Performer Details : "+performer);
     
    }
}
