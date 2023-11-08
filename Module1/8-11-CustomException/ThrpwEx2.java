package com.a811;

import java.io.IOException;

public class ThrpwEx2 
{
	public static void main(String[] args) throws IOException 
	{
		
		int data = 10/0;
		
		if(data>0)
		{
			System.out.println("success");
		}
		else
		{
			throw new IOException();
		}
		
	}
}
