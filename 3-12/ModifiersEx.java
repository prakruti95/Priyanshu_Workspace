package com.a312;

//public,private,protected

class A
{
	public static void a1()
	{
		System.out.println("A1 called");
	}
}
class B extends A
{
	public static void b1()
	{
		System.out.println("B1 called");
	}
}

public class ModifiersEx 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.a1();
		b.b1();
	}
}
