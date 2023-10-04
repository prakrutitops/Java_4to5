package com.a410;


class P
{
	void p()
	{
		System.out.println("P Accessed");
	}
}

abstract class Q extends P
{
	abstract void q();
}

class R extends Q
{
	void r()
	{
		System.out.println("R Accessed");
	}

	@Override
	void q() 
	{
		// TODO Auto-generated method stub
		System.out.println("Q Accessed");
	}
}



public class AbstractEx2 
{
	public static void main(String[] args) 
	{
		
		R r1 =new R();
		
		r1.p();
		r1.q();
		r1.r();
		
		
		
	}
}
