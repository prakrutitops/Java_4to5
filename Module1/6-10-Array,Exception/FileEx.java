package com.a610;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) {
		
		
		//FileOutputStream -> write
		//FileInputStream -> read
		
		
		try 
		{
			String s ="welcome to tops";
			FileOutputStream fout = new FileOutputStream("H://vasu.txt");
			fout.write(s.getBytes());
			
			//FileInputStream fin =new FileInputStream("");
			//fin.read();
			
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("success");
		
	}
}
