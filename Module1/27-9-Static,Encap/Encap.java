package com.a279;

public class Encap 
{
	public static void main(String[] args)
	{
		
		String pass="1234";
		
		Model m = new Model();
		
		//m.setEmail("a@gmail.com");
		//m.setPass("5678");

		
		if(pass.equals(m.getPass()))
		{
			System.out.println("Logged in success");
		}
		else
		{
			System.out.println("Logged in Fail");
		}
	}
	
}
