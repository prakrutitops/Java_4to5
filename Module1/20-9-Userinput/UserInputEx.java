package com.a209;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args)
	{
		
		/*
		 	Scanner class will use to take the value from users
		 	
		 	1. Create an object Scanner
		 	2. Pass the System.in(SYStem input)
		 	
		 	
		 */
		
		//Scanner Object
		
		//classname objname = new classname();
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();

		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println("\n Your id is: "+id+" \n Your Name is : "+name+"\n  Your Salary is: "+salary);
	}
}
