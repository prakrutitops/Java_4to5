package com.a2211;

import java.io.File;
import java.io.IOException;

public class FileEx1 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileEx1 f1 = new FileEx1();
		
		File file = new File("E://topstech");
		file.createNewFile();
		f1.getFileDetails(file);
		
	}

	private void getFileDetails(File file) 
	{
			
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		
	}
}
