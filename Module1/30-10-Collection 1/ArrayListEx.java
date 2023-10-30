package com.a3010;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	
	public static void main(String[] args) 
	{
		
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Php");
		
		
		ArrayList arrayList2 = new ArrayList<>();
		
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(3);
		arrayList2.add("Java");
		
		//System.out.println(arrayList);//Array Format
		
		//Interface - Fetch the value
		
		//arrayList.addAll(arrayList2);
		//arrayList.remove("Php");
		//arrayList.removeAll(arrayList2);
		
		arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();//value fetch
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	
}
