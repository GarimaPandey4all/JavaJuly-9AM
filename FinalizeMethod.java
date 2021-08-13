package com.brainmentors.java.oops;

public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeMethod obj = new FinalizeMethod();
		obj = null; // eligible for garbage collector
		
		//Requesting JVM to call garbage collector method
		System.gc();
		System.out.println("Main Completes");
	}
	
	//Here Overriding Finalize Method
	public void finalize()
	{
		System.out.println("Finalize Method Overridden");
	}

}
