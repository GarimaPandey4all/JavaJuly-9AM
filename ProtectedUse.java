package com.brainmentors.java.oops;

class PersonNew {
	protected String name = "Brain Mentors";
}

class StudentNew extends PersonNew {
	public void print()
	{
		System.out.println(name);
	}
}

public class ProtectedUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentNew student = new StudentNew();
		student.print();
		
	}

}
