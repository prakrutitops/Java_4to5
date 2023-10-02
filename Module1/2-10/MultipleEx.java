package com.a210;

interface P
{
	void p();
}
interface Q
{
	
	void q();
}
class R implements P,Q
{

	@Override
	public void q() 
	{
		
		// TODO Auto-generated method stub
		System.out.println("Q Called");
	}

	@Override
	public void p() 
	{
		// TODO Auto-generated method stub
		System.out.println("P Called");
	}
	
	
	
}

public class MultipleEx 
{
	public static void main(String[] args) 
	{
		
		R r =new R();
		
		r.p();
		r.q();
	}
}
