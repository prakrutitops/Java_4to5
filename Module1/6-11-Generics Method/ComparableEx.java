package com.a611;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	
	int salary;
	String sname;
	
	public Student(int salary,String sname) 
	{
		// TODO Auto-generated constructor stub
		
		this.salary=salary;
		this.sname=sname;
	}

	
	@Override
	public int compareTo(Student o) 
	{
		//sorting
		
		if(this.salary>o.salary)
		{
			return 1;
		}
		else if(this.salary<o.salary)
		{
			return -1;
		}
		else if(this.salary==o.salary)
		{
			return 0;
		}
		
		return 0;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(10000, "A");
		Student s2 = new Student(50000, "B");
		Student s3 = new Student(20000, "C");
		Student s5 = new Student(20000, "E");
		Student s4 = new Student(30000, "D");
	
		
		ArrayList<Student>arrayList = new ArrayList<>();
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		
		Collections.sort(arrayList);
	
		for(Student s : arrayList)
		{
			System.out.println("Salary: - "+s.salary+"  Name : - "+s.sname);
		}
	}
}
