package com.a1212;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList();
		list.add("Java");
		list.add("Python");
		list.add("Php");
		list.addFirst("flutter");
		list.addLast("wd");
		//list.add(1);
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
