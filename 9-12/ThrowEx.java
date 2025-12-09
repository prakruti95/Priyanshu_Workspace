package com.a912;

public class ThrowEx 
{
	public static void main(String[] args) 
	{
		
		validate(15);
		
	
	}
	
	static void validate(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			//System.out.println("Not Eligible to vote");
			throw new ArithmeticException("Age is not valid");
		}
	}
}
