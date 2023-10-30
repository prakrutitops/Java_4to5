package com.a3010;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx 
{
	
	public static void main(String[] args) 
	{
		
		HashSet set = new HashSet<>();
		
		set.add("Android");
		set.add("Java");
		set.add("Php");
		
		
		HashSet set2 = new HashSet<>();
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add("Java");
		set2.add("Android");
		set2.add("Php");
		
		//System.out.println(arrayList);//Array Format
		
		//Interface - Fetch the value
		
		set.addAll(set2);
		//arrayList.remove("Php");
		//arrayList.removeAll(arrayList2);
		
		//arrayList.retainAll(arrayList2);
		
		Iterator i = set.iterator();//value fetch
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	
}
