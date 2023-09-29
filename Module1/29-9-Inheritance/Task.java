package com.a299;

class M1
{
	String color="black";
}
class M2 extends M1
{
	String color="white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(color);
	}
}

public class Task 
{
	public static void main(String[] args) {
		
		
		M2 m =new M2();
		m.display();
		
	}
}
