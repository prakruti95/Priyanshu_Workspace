package com.a1311;

public class Nestedifex 
{
	public static void main(String[] args) 
	{
		int age = 66;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
			if(age>=60)
			{
				System.out.println("Senior citizen");
			}
			else
			{
				System.out.println("Young Age");
			}
			
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}
