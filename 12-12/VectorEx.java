package com.a1212;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(5);
		
		v.addElement("priyanshu");
		v.addElement("kaival");
		v.addElement("parakh");
		v.addElement("kaival");
		v.addElement("parakh");
		v.addElement("parakh");
		v.addElement("kaival");
		v.addElement("parakh");
		v.addElement("kaival");
		v.addElement("parakh");
		v.addElement("parakh");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.contains("kaival"));
	}
}
