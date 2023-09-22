package com.a229;

import java.util.jar.Attributes.Name;

public class CopyEx 
{
	int id;
	String name;
	
	CopyEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
	
		id = i;
		name = n;
	}
	
	CopyEx(CopyEx c)
	{
		System.out.println("C2 Value : "+c.id+" "+c.name);
	}
	
	public static void main(String[] args) {
		
		
		CopyEx c1 =new CopyEx(101,"a");
		CopyEx c2 =new CopyEx(c1);
		
	}
}
