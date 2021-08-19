package com.brainmentors.java.oops;

interface Show {
	void show();
}

interface Display
{
	void display();
}

class ChildClass implements Show, Display {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("How are you?");
	}	
	
}

public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj = new ChildClass();
		obj.display();
		obj.show();

	}

}
