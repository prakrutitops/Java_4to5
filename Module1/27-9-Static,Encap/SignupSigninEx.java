package com.a279;

import java.util.Scanner;

public class SignupSigninEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("-----------------Sign Up --------------------------");
		
		System.out.println("Enter Your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter Your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your Password");
		String pass = sc.next();
		
		
		FbModel m =new FbModel();
		
		m.setFirstname(fname);
		m.setLastname(lname);
		m.setEmail(email);
		m.setPassword(pass);
		
		System.out.println("Sign Up Succesfully Done");
		
		
		System.out.println("-----------------Sign In --------------------------");
		
		System.out.println("Enter Your Email");
		String email1 = sc.next();
		
		System.out.println("Enter Your Password");
		String pass1 = sc.next();
		
		if(email1.equals(m.getEmail()) && pass1.equals(m.getPassword()))
		{
			System.out.println("Logged in Succesfully");
		}
		else
		{
			System.out.println("Wrong Credentials");
		}
		
		
	}
}
