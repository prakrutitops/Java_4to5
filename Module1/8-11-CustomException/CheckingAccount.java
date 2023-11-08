package com.a811;

public class CheckingAccount 
{
	int accn;
	double balance;
	
	public CheckingAccount(int acn) 
	{
		// TODO Auto-generated constructor stub
		
		this.accn=acn;
	}
	
	void deposit(double balance)
	{
		this.balance=balance;
	}
	
	public int getAccn() {
		return accn;
	}
	public void setAccn(int accn) {
		this.accn = accn;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double amount) throws InsufficientFundException
	{
		
		if(amount>=balance)
		{
			double needs = amount-balance;
			throw new InsufficientFundException(needs);
		}
		else
		{
			balance = balance - amount;
		}
		
	}
	
	
}
