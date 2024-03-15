package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Person;

public class MyDao 
{
	public void insertdata(Person p)
	{
		
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);//insert into tablename
		tr.commit();
		sess.close();
		
	}
	
	//delete
	public void deleetdata(Person p)
	{
		
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(p);//delete into tablename
		tr.commit();
		sess.close();
		
	}
	
	//update
	public void updatedata(Person p)
	{
		
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(p);//update into tablename
		tr.commit();
		sess.close();
	}
	
	public List<Person>viewdata()
	{
		Session sess = new Util().getconnect();
		List<Person> getall = sess.createQuery("from Person").list();
		
		sess.close();
		return getall;
	}
	public Person getSingle(Person p)
	{
		Session sess = new Util().getconnect();
		Person person = (Person) sess.get(Person.class, p.getId());
		
		sess.close();
		return person;
	}
	
	
	
	
}
