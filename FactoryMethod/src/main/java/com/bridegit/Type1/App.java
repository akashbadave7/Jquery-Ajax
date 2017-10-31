package com.bridegit.Type1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    A a=(A)context.getBean("a");  
	    a.msg();  
	}  
}
