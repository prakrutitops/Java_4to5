package com.a811;

public class InsufficientFundException extends Exception
{
	double amount;
	
	public InsufficientFundException(double amount) 
	{
		// TODO Auto-generated constructor stub
		
		this.amount=amount;
	}
	

	public double getAmount() 
	{
		return amount;
	}

	
	
}
