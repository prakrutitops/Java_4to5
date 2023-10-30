package com.a3010;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v = new Vector<>(5);
		
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("c");
		v.addElement("d");
		v.addElement("c");
		v.addElement("d");
		v.addElement("c");
		v.addElement("d");
		v.addElement("d");
		
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		
	}
}
