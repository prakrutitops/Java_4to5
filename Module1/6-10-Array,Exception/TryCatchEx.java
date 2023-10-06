package com.a610;

public class TryCatchEx 
{
	public static void main(String[] args) {
		
		
		try
		{
			//logic
			int data = 10/0;
			System.out.println(data);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("executed");
		
		
	}
}
