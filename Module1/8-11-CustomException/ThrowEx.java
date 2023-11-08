package com.a811;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			try
			{
				throw new TopsException();
			}
			catch(Exception e)
			{
			//	System.out.println("Error");
				e.printStackTrace();
			}
			finally
			{
					System.out.println("a");
			}
			
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		validate(15);
		
	}
}
