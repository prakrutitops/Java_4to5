package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class Dao extends HibernateDaoSupport
{
	
	public void insertdata(Person p)
	{
		getHibernateTemplate().save(p);
	}
	
	public void updatedata(Person p)
	{
		getHibernateTemplate().update(p);
	}
	
	public void deletedata(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		getHibernateTemplate().delete(p);
	}
	public List<Person> viewdata()
	{
		List<Person> getlist = this.getHibernateTemplate().find("from Person");
		
		return getlist;
	}
	
}
