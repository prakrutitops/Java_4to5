package com.a410;

public class StringEx4 
{
	public static void main(String[] args)
	{
		
		
		String s1 ="sachin";
		String s2 ="SAURAV";
		String s3 ="  tops  ";				
		
		String data = "php is a programming language. php is a open source . php is a secure language";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.charAt(1));
		System.out.println(s3.trim());
		System.out.println(s1.startsWith("n"));
		System.out.println(s1.endsWith("n"));
		
		
		System.out.println(data.replace("php","Java"));
		
		
	}
}
