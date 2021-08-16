package com.brainmentors.java.oops;

abstract class PersonBase {
	
	private String name;
	private int age;
	
	PersonBase(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void printName()
	{
		System.out.println(name+" "+age);
	}
	
	public abstract void contNumber(); 
	
}

class StudentChild extends PersonBase {
	
	private int id;
	
	StudentChild(int id)
	{
		super("Ram Kumar", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println("Student id is: "+id);
	}

	@Override
	public void contNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student's Contact Number");
	}
	
}



public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentChild student = new StudentChild(100);
		student.printId();
		student.printName();
		student.contNumber();
		
		//PersonBase person = new PersonBase(); // error.

	}

}
