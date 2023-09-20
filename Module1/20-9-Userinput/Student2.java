package com.a209;

import java.util.Scanner;

public class Student2 
{
	int id;
	String fname,email;
	
	

	
	//method
	void display()
	{
		System.out.println(id+" "+fname+" "+email);
	}
	
	
	public static void main(String[] args) 
	{
		
		Student2 s1 =new Student2();
		
		s1.id=101;
		s1.fname="soham";
		s1.email="soham@gmail.com";
		
		
		Student2 s2 =new Student2();
		
		s2.id=102;
		s2.fname="vivek";
		s2.email="vivek@gmail.com";
		
		Student2 s3 =new Student2();
		
		s3.id=103;
		s3.fname="vasu";
		s3.email="vasu@gmail.com";
		
		
		/*
		 * System.out.println(s1.id+" "+s1.fname+" "+s1.email);
		 * System.out.println(s2.id+" "+s2.fname+" "+s2.email);
		 * System.out.println(s3.id+" "+s3.fname+" "+s3.email);
		 */
		
		s1.display();
		s2.display();
		s3.display();
		
	}
}
