package com.a299;


class A1
{
	void a1()
	{
		System.out.println("A1 Accessed");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("B1 Accessed");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("C1 Accessed");
	}
}
class D1 extends C1
{
	void d1()
	{
		System.out.println("D1 Accessed");
	}
}

public class MultiLevelEx 
{
	public static void main(String[] args)
	{
		
		
		D1 b1 =new D1();
		
		b1.a1();
		b1.b1();
		b1.c1();
		b1.d1();
	}
}
