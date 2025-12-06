package com.a612;

public class ObjectEx 
{
	public static void main(String[] args) 
	{
		Object o1 = new Object();
		Object o2 = new Object();
//		o1.notify();
//		o1.notifyAll();
		System.out.println(o1.equals(o2));
		System.out.println(o1.getClass());
		
	}
}
