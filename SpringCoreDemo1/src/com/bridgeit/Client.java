package com.bridgeit;

public class Client {

	public static void main(String[] args) {
		// object constructor done by developer
		Employee emp=new Employee();
		emp.setEid(10);
		emp.setEname("John");
		emp.setAddress("XYZ");
		System.out.println("Employee Details : "+ emp);
		
		// spring way IOC(Inversion of controle)
	}

}
