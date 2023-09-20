package com.a209;

import java.util.Scanner;

public class Data1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Any Number");

		int num = sc.nextInt();
		
		
		if(num>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("negative");
		}
	
	}
}
