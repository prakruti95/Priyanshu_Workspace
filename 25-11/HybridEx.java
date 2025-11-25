package com.a2511;


class A11
{
	void a11()
	{
		System.out.println("A11");
	}
}
class B11 extends A11
{
	void b11()
	{
		System.out.println("B11");
	}
}
interface C11 
{
	void c11();
}
class D11 extends B11 implements C11
{
	void d11()
	{
		System.out.println("D11");
	}

	@Override
	public void c11() {
		// TODO Auto-generated method stub
		System.out.println("C11");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		D11 d = new D11();
		
		d.a11();
		d.b11();
		d.c11();
		d.d11();
	}
}
