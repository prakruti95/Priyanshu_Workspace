package com.a1212;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add("Java");
		set.add("Python");
		set.add("Php");
	    set.add("Java");
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
