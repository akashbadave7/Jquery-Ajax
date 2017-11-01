package com.bridegit.Type2;

import java.util.Scanner;

public class PrintableFactory {  
	public static Printable getPrintable(){  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter option A or B");	
		if(scan.next().charAt(0)=='A')		
		{
			return new A();
		}
		return new B();  
         //return any one instance, either A or B  
}  
}  