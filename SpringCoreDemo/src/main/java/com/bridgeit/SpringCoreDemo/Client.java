package com.bridgeit.SpringCoreDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		// object constructor done by developer
		/*Employee emp=new Employee();
		emp.setEid(10);
		emp.setEname("John");
		emp.setAddress("XYZ");
		System.out.println("Employee Details : "+ emp);*/
		
		// spring way IOC(Inversion of controle)
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		 
       
/*        Employee emp1 = (Employee)context.getBean("emp1");
        Employee emp2 = (Employee)context.getBean("emp2");*/
		 Employee emp1 = (Employee) context.getBean("emp1");
		/*Employee emp2 = context.getBean("emp2",Employee.class);*/
        
		System.out.println("Employee Details : "+ emp1);
		/*System.out.println("Employee Details : "+ emp2);*/
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
		cxt.close();
	}

}
