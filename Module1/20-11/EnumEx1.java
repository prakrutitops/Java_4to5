package com.a2011;

enum Student
{
		John(10), Bella(20), Sam(30), Viraaj(25);
		
		int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		private Student(int age) 
		{
			// TODO Auto-generated constructor stub
			this.age=age;
		}
		
	
}

public class EnumEx1 
{
	public static void main(String[] args) 
	{
		
		System.out.println(Student.Sam.getAge());
		
	}
}
