package com.a2611;

public class SvmEx 
{
	String name;
	static String college="TOPS";
	
	public SvmEx(String name) 
	{
		this.name=name;
	}
	void display()
	{
		System.out.println(name+" from "+college);
	}
	static void change()
	{
		college="Abcd";
	}
	public static void main(String[] args) 
	{
			change();
			
			SvmEx s1 = new SvmEx("Priyanshu");
			SvmEx s2 = new SvmEx("Naman");
			SvmEx s3 = new SvmEx("Manthan");
			
			s1.display();
			s2.display();
			s3.display();
			
	}
}
