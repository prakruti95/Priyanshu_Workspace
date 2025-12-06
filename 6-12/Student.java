package com.a612;

enum test
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	
	private int age;

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	private test(int age) 
	{
		this.age= age;
	}
}

public class  Student 
{
	public static void main(String[] args) 
	{
		System.out.println("Age of Viraaj Sis " +test.Viraaj.getAge()+ " years");
	}
	
}



