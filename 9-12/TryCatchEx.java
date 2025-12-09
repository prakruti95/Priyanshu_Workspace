package com.a912;

public class TryCatchEx 
{
	public static void main(String[] args) 
	{
		//logic
		try
		{
			int data = 10/0;
			System.out.println(data);
		}
		//error catch
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Executed");
		}
		
		
	}
}
