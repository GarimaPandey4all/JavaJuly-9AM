package com.brainmentors.java.oops;

final class Base {
	public final void finalMethod()
	{
		System.out.println("Parent Class");
	}
}

class Derived extends Base {
	
	public final void finalMethod()
	{
		System.out.println("Child Class");
	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			final float pi = 3.14f;
			
			//pi = 45.67f; // error	
			
	}

}
