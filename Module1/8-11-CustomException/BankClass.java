package com.a811;

public class BankClass 
{
	public static void main(String[] args) throws InsufficientFundException 
	{
		BankClass b1 =new BankClass();
		CheckingAccount c1 =new CheckingAccount(101);
		
		c1.deposit(50000);
		try
		{
			c1.withdrawal(60000);
			System.out.println("Your Remaining balance is = "+c1.getBalance());
			
		}
		catch(InsufficientFundException e)
		{
			//System.out.println(e);
			System.out.println("You Need More "+e.getAmount() + " Ruppees");
		}
		
		
		
	}
}
