package com.a910;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx 
{
	public static void main(String[] args) {
		
		
		try 
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://parag.txt"));
			 Student s =  (Student) in.readObject();
			System.out.println(s.id+" "+s.name);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

