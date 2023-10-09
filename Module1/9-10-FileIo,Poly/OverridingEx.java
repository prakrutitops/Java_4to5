package com.a910;

class Rbi
{
	int rate()
	{
		return 0;
	}
}

class Sbi extends Rbi
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Rbi
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Rbi
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx
{
	public static void main(String[] args) 
	{
			
		Rbi r =new Rbi();
		System.out.println(r.rate());
		
		r =new Sbi();
		System.out.println(r.rate());
		
		r =new Icici();
		System.out.println(r.rate());
		
		r =new Axis();
		System.out.println(r.rate());
		
	}
	
}
