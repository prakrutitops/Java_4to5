package com.a611;

public class TryCatchEx 
{
	public static void main(String[] args) 
	{
		
		try
		{
				int a= 10;
				int b= 0;
				int c= a/b;
				System.out.println(c);
		}
		catch (Exception e)
		{
			//System.out.println(e);->which error
			e.printStackTrace();//->which and where
		}
		finally 
		{
			System.out.println("Executed");
		}
		
		
		
		
	}
}
