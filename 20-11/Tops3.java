package com.a2011;

public class Tops3 
{
	
	int rollno;
	String name,surname,email,city;
	
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+surname+" "+email+" "+city);
	}
	
	public static void main(String[] args) 
	{
		
			//object
			
			Tops3 t1 = new Tops3();
			Tops3 t2 = new Tops3();
			Tops3 t3 = new Tops3();
			Tops3 t4 = new Tops3();
			Tops3 t5 = new Tops3();
			
			
			t1.rollno=101;
			t1.name="Priyanshu";
			t1.surname="xyz";
			t1.email="p@gmail.com";
			t1.city="Rajkot";
			
			t2.rollno=101;
			t2.name="Priyanshu";
			t2.surname="xyz";
			t2.email="p@gmail.com";
			t2.city="Rajkot";
			
			t3.rollno=101;
			t3.name="Priyanshu";
			t3.surname="xyz";
			t3.email="p@gmail.com";
			t3.city="Rajkot";
			
			t4.rollno=101;
			t4.name="Priyanshu";
			t4.surname="xyz";
			t4.email="p@gmail.com";
			t4.city="Rajkot";
			
			t5.rollno=101;
			t5.name="Priyanshu";
			t5.surname="xyz";
			t5.email="p@gmail.com";
			t5.city="Rajkot";
			
			t1.display();
			t2.display();
			t3.display();
			t4.display();
			t5.display();
		
	}
}
