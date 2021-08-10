package com.brainmentors.java.oops;

//Parent Class
class Person {
	
	private String name;
	
	Person()
	{
		name = "Ram Kumar";
	}
	
	public void printName()
	{
		System.out.println("Name of the person is "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact number of person");
	}
}

//Child Class
class Student2 extends Person{ // extends - inheritance
	
	private int id;
	
	Student2()
	{
		//super(); // Call Parent's Class Default Constructor (Implicit Super Call)
		id = 100;
	}
	
	public void printId()
	{
		System.out.println("Id is "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact number of Student");
	}
}


public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 student = new Student2();
		student.printId();
		student.printName();
		student.contNumber();

	}

}
