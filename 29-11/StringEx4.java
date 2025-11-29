package com.a2911;

public class StringEx4 
{
	public static void main(String[] args) 
	{
		String s1 = "sachin";
		
		String s2 = new String("sachin");
		
		String s3 = "ratan";
		
		String s4 = "SACHIN";
		
		String s5="sachin";
		
		String s6 = "  tops  ";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s6.trim());
		System.out.println(s5.charAt(0));
		
		String s7 = "java is a programming language, java is a secure language";
		
		System.out.println(s7.replace("java","tops"));
		
	}
}
