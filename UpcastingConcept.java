package com.brainmentors.java.oops;

class Parent {
	public void printData()
	{
		System.out.println("Method of Parent Class");
	}
}

class Child extends Parent {
	public void printData()
	{
		System.out.println("Method of Child Class");
	}
}

public class UpcastingConcept {
	
	public static void main(String[] args) {
		
		Parent parent1 = (Parent)new Child();
		parent1.printData();
		
		Parent parent2 = (Parent)new Child();
		parent2.printData();
	}

}
