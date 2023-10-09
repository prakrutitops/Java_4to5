package com.a910;

import java.io.Serializable;

//serializable will serialize[outputstream] and deserialize[inputstream] data
public class Student implements Serializable
{
	int id;
	String name;
	
	public Student(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
		
	}
}
