package com.a111;

import java.util.Stack;

public class StackEx 
{
	//push
	static void adddata(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	
	//pop
	static void removedata(Stack st)
	{
		Integer i =(Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		
		
		Stack st = new Stack<>();
		
		adddata(st,10);
		adddata(st,20);
		adddata(st,30);
		adddata(st,40);
		
		try
		{
			removedata(st);
			removedata(st);
			removedata(st);
			removedata(st);
			removedata(st);
			removedata(st);
			removedata(st);
		}
		catch(Exception e)
		{
			System.out.println("No Data");
		}
		
		
		
		
	}
	
	
}
