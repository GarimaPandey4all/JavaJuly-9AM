package com.brainmentors.java.oops;

public class Student {
	
	//Private member variables / Data Hiding / Data Security
	
	private int rollno; // Instance Variables / Data Members
	private String name;
	private String phone;
	private String course;
	private double fees;
	
	//public member methods
	
	//r, n, p, c, f are local variables
	public void takeInput(int rollno, String name, String phone, String course, double fees)
	{
		//instance variables assign local variables
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	public void print()
	{
		System.out.println("Roll No is "+ this.rollno);
		System.out.println("Name is "+name);
		System.out.println("Phone is "+phone);
		System.out.println("Courses is "+course);
		System.out.println("Fees is "+fees);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
		Student shyam = new Student();
		
		ram.takeInput(1001, "Ram Kumar", "83728764454", "MCA", 6487.78);
		ram.print();
		
		shyam.takeInput(1002, "Shyam Sharma", "43917098798", "B.Teach", 32487.89);
		shyam.print();
		
		/*
		System.out.println("Roll No is "+ram.rollno);
		System.out.println("Name is "+ram.name);
		System.out.println("Phone is "+ram.phone);
		System.out.println("Courses is "+ram.course);
		System.out.println("Fees is "+ram.fees);
		
		ram.rollno = 1001;
		ram.name = "Ram Kumar";
		ram.phone = "73260874687";
		ram.course = "MCA";
		ram.fees = 6678.79;

		System.out.println("Roll No is "+ram.rollno);
		System.out.println("Name is "+ram.name);
		System.out.println("Phone is "+ram.phone);
		System.out.println("Courses is "+ram.course);
		System.out.println("Fees is "+ram.fees);
		*/
	}

}
