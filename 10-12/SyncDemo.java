package com.a1012;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending "+msg);
		
		System.out.println(msg+" Sent");
	}
}
class MySender extends Thread
{
	Sender sender;
	String msg;
	
	MySender(Sender sender,String msg)
	{
		this.sender=sender;
		this.msg=msg;
	}
	
	@Override
	public void run() 
	{
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
	}
}

public class SyncDemo 
{
	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		MySender m1 = new MySender(sender, "Hii");
		MySender m2 = new MySender(sender, "Byee");
		
		m1.start();
		m2.start();
	}
}
