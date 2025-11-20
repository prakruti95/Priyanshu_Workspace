package com.a2011;

public class Tops4 
{
	
	int rollno;
	String name,surname,email,city;
	
	//constructor
	Tops4(int r,String n,String s,String e,String c)
	{
		rollno = r;
		name = n;
		surname = s;
		email = e;
		city = c;
	}
	
	//method
	void display()
	{
		System.out.println(rollno+" "+name+" "+surname+" "+email+" "+city);
	}
	
	public static void main(String[] args) 
	{
		
			//object
			
		//constructor call
			Tops4 t1 = new Tops4(101,"Priyanshu","a","p@gmail.com","Rajkot");
			Tops4 t2 = new Tops4(101,"Priyanshu","a","p@gmail.com","Rajkot");
			Tops4 t3 = new Tops4(101,"Priyanshu","a","p@gmail.com","Rajkot");
			Tops4 t4 = new Tops4(101,"Priyanshu","a","p@gmail.com","Rajkot");
			Tops4 t5 = new Tops4(101,"Priyanshu","a","p@gmail.com","Rajkot");
			
			
			
			//method call
			t1.display();
			t2.display();
			t3.display();
			t4.display();
			t5.display();
		
	}
}
