package com.a210;

class A1
{
	void a()
	{
		System.out.println("A Called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("B Called");
	}
}
interface C1 
{
	void c();
	
}
class D1 extends B1 implements C1
{
	
	//d,b,a,c
	void d()
	{
		System.out.println("D Called");
	}

	@Override
	public void c() 
	{
		// TODO Auto-generated method stub
		System.out.println("C Called");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		D1 d =new D1();
		
		d.a();
		d.b();
		d.c();
		d.d();
		
		
		
	}
}
