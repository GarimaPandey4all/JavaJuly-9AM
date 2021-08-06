package com.brainmentors.java.oops;

public class Student {
	
	int rollno; // Instance Variables / Data Members
	String name;
	String phone;
	String courses;
	double fees;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
		
		System.out.println("Roll No is "+ram.rollno);
		System.out.println("Name is "+ram.name);
		System.out.println("Phone is "+ram.phone);
		System.out.println("Courses is "+ram.courses);
		System.out.println("Fees is "+ram.fees);

	}

}
