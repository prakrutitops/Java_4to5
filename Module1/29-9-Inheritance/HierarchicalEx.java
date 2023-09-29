package com.a299;

class Bank
{
	void bank()
	{
		System.out.println("banking");
	}
}

class Current extends Bank
{
	void current()
	{
		System.out.println("current");
	}
}

class Save extends Bank
{
	void save()
	{
		System.out.println("saving");
	}
}

public class HierarchicalEx 
{
	public static void main(String[] args)
	{
	
		Current c1 =new Current();
		Save s1 =new Save();
		
		c1.current();
		s1.save();
		s1.bank();
		
	}
}
