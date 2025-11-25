package com.a2511;

//collection of abstract method
interface print
{
	void print();//abstract method
	
}
interface show
{
	void show();
}

public class InterfaceEx implements print,show 
{
	public static void main(String[] args) 
	{
		InterfaceEx i = new InterfaceEx();
		i.print();
		i.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	
}
