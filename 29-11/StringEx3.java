package com.a2911;

public class StringEx3 
{
	public static void main(String[] args) 
	{
		String s1 = "sachin";
		
		String s2 = new String("sachin");
		
		String s3 = "ratan";
		
		String s4 = "SACHIN";
		
		String s5="sachin";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		System.out.println(s3.compareTo(s1));
	
		System.out.println(s1==s5);
	
	}
}
