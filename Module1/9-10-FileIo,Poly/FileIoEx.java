package com.a910;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoEx 
{
	
	public static void main(String[] args) {
		
		
		
		//FileOutputStream - write 
		//FileInputStream  - reaD
		
		
		try 
		{
			String s ="Welcome to tops";
			FileOutputStream fout =new FileOutputStream("H://soham.txt");
			fout.write(s.getBytes());
		} 
		catch (Exception e) 
		{
			//e.printStackTrace();
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Executed");
		}
		
		
		
		
		
	}
	
	
}
