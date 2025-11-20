package com.a2011;

public class Tops 
{
	
	int rollno;
	String name,surname;
	
	public static void main(String[] args) 
	{
		
			//object
			
			Tops t1 = new Tops();
			Tops t2 = new Tops();
			
			t1.rollno=101;
			t1.name="Priyanshu";
			t1.surname="xyz";
			
			t2.rollno=102;
			t2.name="vipul";
			t2.surname="xyz";
			
			System.out.println(t1.rollno+" "+t1.name+" "+t1.surname);
			System.out.println(t2.rollno+" "+t2.name+" "+t2.surname);
			
			
		
		
	}
}
