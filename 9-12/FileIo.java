package com.a912;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo 
{
	public static void main(String[] args) throws IOException 
	{
		try 
		{	
			String s="Hello Priyanshu";
			FileOutputStream fout = new FileOutputStream("E://priyanshu.txt");
			fout.write(s.getBytes());
			System.out.println("Executed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
