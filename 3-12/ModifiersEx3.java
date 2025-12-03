package com.a312;

//public,private,protected

class A111
{
	protected static void a1()
	{
		System.out.println("A1 called");
	}
}
class B111 extends A111
{
	private static void b1()
	{
		System.out.println("B1 called");
	}
}

public class ModifiersEx3 
{
	public static void main(String[] args) 
	{
		A111 a = new A111();
		B111 b = new B111();
		b.a1();
		a.a1();
		
	}
}
