package com.a11;


class Sender
{
	
	public void send(String msg)
	{
		
		System.out.println("Sending "+msg);

			
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg+" Sent");
	}

}

class ThreadSend extends Thread
{
	
	Sender sender;//refrence variable
	String msg;
	
	public ThreadSend(Sender sender,String msg) 
	{
		this.sender=sender;
		this.msg = msg;
	}
	
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
	
		
		//synchronization
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
			
			Sender sender =new Sender();//object
			
			ThreadSend t1 =new ThreadSend(sender,"Hii");
			ThreadSend t2 =new ThreadSend(sender,"Byee");
			
			t1.start();
			t2.start();
			
		}
	
}



//Sending Hii
//Hii Sent
//Sending Byee
//Byee Sent
