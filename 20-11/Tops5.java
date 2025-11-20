package com.a2011;

import java.util.Scanner;

public class Tops5 
{
	
	int rollno;
	String name,surname,email,city;
	
	Tops5(int r,String n,String s,String e,String c)
	{
		rollno = r;
		name = n;
		surname = s;
		email = e;
		city = c;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+surname+" "+email+" "+city);
	}
	
	public static void main(String[] args) 
	{
		
			//object
			
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter Your Roll Number");
			int r = sc.nextInt();
			
			System.out.println("Enter Your Name");
			String n = sc.next();
			
			System.out.println("Enter Your Surname");
			String s = sc.next();
			
			System.out.println("Enter Your Email");
			String e = sc.next();
			
			System.out.println("Enter Your City");
			String c = sc.next();
			
		
			Tops5 t1 = new Tops5(r,n,s,e,c);
			t1.display();
				
			
			
		
	}
}
