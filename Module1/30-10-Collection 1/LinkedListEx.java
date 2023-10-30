package com.a3010;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		
		LinkedList linkedList = new LinkedList<>();
		
		linkedList.add("Android");
		linkedList.add("Java");
		linkedList.add("Php");
		linkedList.addFirst("Flutter");
		linkedList.addLast("reactnative");
		
		
		
		LinkedList linkedList2 = new LinkedList<>();
		
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.add(3);
		linkedList2.add("Java");
		
		//System.out.println(arrayList);//Array Format
		
		//Interface - Fetch the value
		
		linkedList.addAll(linkedList2);
		//arrayList.remove("Php");
		//arrayList.removeAll(arrayList2);
		
		//linkedList.retainAll(linkedList2);
		
		Iterator i = linkedList.iterator();//value fetch
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
