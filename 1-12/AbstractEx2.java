package com.a112;

abstract class A11
{
	//non-abstract method
	void a1()
	{
		
	}
	
	//abstract method
	abstract void a2();
	
}

public class AbstractEx2 extends A11
{
	public static void main(String[] args) 
	{
		//A11 a = new A11();//you can not create object of abstract class

		AbstractEx2 a2 = new AbstractEx2();
		a2.a1();
		a2.a2();
	}

	@Override
	void a2() 
	{
		System.out.println("Hello");
		
	}

	
}
