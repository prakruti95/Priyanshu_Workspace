package com.a1212;

import java.util.Stack;

public class StackEx 
{
	
	static void push(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	static void pop(Stack st)
	{
		Integer i =  (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args)
	{
		Stack s = new Stack();
		
		push(s, 10);
		push(s, 20);
		push(s, 30);
		push(s, 40);
		push(s, 50);
		
		try
		{
			pop(s);
			pop(s);
			pop(s);
			pop(s);
			pop(s);
		}
		catch(Exception e)
		{
			System.out.println("No data");
		}
	
	}
}
