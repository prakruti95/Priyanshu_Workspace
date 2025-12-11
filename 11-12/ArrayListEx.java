package com.a1112;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList list = new ArrayList();//object
		ArrayList list2 = new ArrayList();
		
		list.add("priyanshu");
		list.add("xyz");
		list.add("abc");
		list.add("tops");
		
		list2.add("java");
		list2.add("php");
		list2.add("python");
		list2.add("tops");
		
		System.out.println(list);
		System.out.println(list2);
		
		//list.addAll(list2);
		
		//list.remove("python");
		//list.remove(0);
		
		//list.removeAll(list2);
		
		list.retainAll(list2);
		
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
