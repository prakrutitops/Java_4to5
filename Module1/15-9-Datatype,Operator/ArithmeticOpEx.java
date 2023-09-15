package com.a159;

public class ArithmeticOpEx 
{
	public static void main(String[] args) 
	{

			int num1 = 6;
			int num2 = 3;
			
			
			int add = num1+num2;
			
			System.out.println("Additions is : " + add);
			
			int sub = num1-num2;
			
			System.out.println("Substraction is :"+sub);
		
			int mul = num1*num2;
			
			System.out.println("Multiplication is :"+mul);
			
			int div = num1/num2;
			
			System.out.println("Division is : "+div);
		
			
			int mod = num1%num2;
			
			System.out.println("Modulus is : "+mod);
			
			
			if(add<10)
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Fail");
			}
			
			
			
			
		
	}
}
