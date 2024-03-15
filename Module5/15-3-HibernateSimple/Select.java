package com.controller;

import java.util.List;

import com.dao.MyDao;
import com.model.Person;

public class Select 
{
	public static void main(String[] args) 
	{
		
		List<Person> list = new MyDao().viewdata();
		System.out.println("ID\t|\tName\t|\tPassword");
		
		for (Person person : list) 
		{
			//i++;
			System.out.println(person.getId()+"\t|\t"+person.getName()+"\t|\t"+person.getSurname());
			
		}
		
	}
}
