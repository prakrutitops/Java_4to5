package com.a299;


class A
{
	void a1()
	{
		System.out.println("A1 Accessed");
	}
}
class B extends A
{
	void b1()
	{
		System.out.println("B1 Accessed");
	}
}

public class SingleInEx 
{
	public static void main(String[] args)
	{
		
		
		B b1 =new B();
		
		b1.a1();
		b1.b1();
		
	}
}
