package com.a312;

//implicit -> internal
//explicit -> external

public class TypeCastingEx 
{
	public static void main(String[] args) 
	{
		float a = 10.00F;
		
		int b = (int)a;//external
		
		System.out.println(b);
	}
}
