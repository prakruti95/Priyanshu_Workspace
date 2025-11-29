package com.a2911;

public class StringEx2 
{
	public static void main(String[] args) 
	{
		char ch[]= {'p','r','i','y','a','n','s','h','u'};
		
		String s1 = "priyanshu";//literal string
		String s2 = new String("priyanshu");//new keyword string
		String s3 =  new String(ch);//character array string
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
