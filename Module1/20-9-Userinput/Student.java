package com.a209;

import java.util.Scanner;

public class Student 
{
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		System.out.println("Enter Your Confirm Password");
		String cpass = sc.next();
		
		/*
		 * System.out.println("Enter Your float value"); float f1= sc.nextFloat();
		 * 
		 * System.out.println("Enter Your Double Value"); double d1= sc.nextDouble();
		 * 
		 * System.out.println("Enter Your chracter"); char c1 = sc.next().charAt(0);
		 * 
		 * System.out.println("Enter Your boolean value"); boolean b1 =
		 * sc.nextBoolean();
		 */
		
		if(pass.equals(cpass))
		{
			System.out.println("\n Your id is: "+id);
			System.out.println("\n Your firstname is: "+fname);
			System.out.println("\n Your lastname is: "+lname);
			System.out.println("\n Your email is: "+email);
			System.out.println("\n Your password is: "+pass);
			
		}
		else
		{
			System.out.println("Password and Confirm Password are not same");
		}
		
		
		
		
		
	}
}
