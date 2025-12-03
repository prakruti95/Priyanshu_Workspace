package com.a312;

//public,private,protected

class A1
{
	private static void a1()
	{
		System.out.println("A1 called");
	}
}
class B1 extends A1
{
	private static void b1()
	{
		System.out.println("B1 called");
	}
}

public class ModifiersEx2 
{
	public static void main(String[] args) 
	{
		B1 b = new B1();
		b.a1();
		b.b1();
	}
}
