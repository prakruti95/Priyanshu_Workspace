package com.a1212;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetEx2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet();
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
