package com.a229;

public class ParaEx1 
{
	//global variable
	int id;
	String name;
	
	public ParaEx1(int id,String name) 
	{
		//local variable
		
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
		
	}
	
	public static void main(String[] args) 
	{
	
		
		ParaEx1 p1 =new ParaEx1(101,"Nikhil");
		ParaEx1 p2 =new ParaEx1(102,"Parag");
		
		p1.display();
		p2.display();
	}
}
