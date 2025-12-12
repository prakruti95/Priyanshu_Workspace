package com.a1212;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add("Java");
		list.add("Python");
		list.add("Php");
		list.addFirst("flutter");
		list.addLast("wd");
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
