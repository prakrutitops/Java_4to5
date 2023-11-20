package com.a2011;

public class GarbageCollectionEx 
{
	
	@Override
	protected void finalize() throws Throwable 
	{
		// TODO Auto-generated method stub
		super.finalize();
		
		System.out.println("Garbage Collection Called");
	}
	
	public static void main(String[] args) 
	{
		
		
		GarbageCollectionEx ge1 = new GarbageCollectionEx();
		GarbageCollectionEx ge2 = new GarbageCollectionEx();
		GarbageCollectionEx ge3 = new GarbageCollectionEx();
	
		ge1 = null;
		ge2 = null;
		ge3 = null;
		
		System.gc();
	}
}
