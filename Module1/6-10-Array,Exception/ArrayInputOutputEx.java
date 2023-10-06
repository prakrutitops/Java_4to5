package com.a610;

import java.util.Scanner;

public class ArrayInputOutputEx 
{
	
	public static void main(String[] args)
	{
		
		int marks[] =new int[4];
		//int marks = 0;
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			
			System.out.println("Enter Marks For Student : "+i);
			marks[i] = sc.nextInt();
			
		}
		//marks[0],marks[1],marks[2],marks[3];
		//System.out.println(marks);
		
		  for(int j=0;j<4;j++) {
		  
		  System.out.println(marks[j]);
		  
		  }
		 
		
		
	}
	
}
