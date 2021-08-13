package com.brainmentors.java.oops;

class ParentNew {
	public void printData()
	{
		System.out.println("Method of Parent Class");
	}
}

class ChildNew extends ParentNew {
	public void printData()
	{
		System.out.println("Method of Child Class");
	}
}

public class DowncastingConcept {
	
	public static void main(String[] args) {
		
		ParentNew parent = new ChildNew();
		
		//Explicitly Downcasting
		ChildNew child = (ChildNew)parent;
		
		child.printData();
	}
}
