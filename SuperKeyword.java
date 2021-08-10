package com.brainmentors.java.oops;

class Person1 {
	
	private String name;
	
	Person1()
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

class Employee extends Person1 {
	
	private int salary;
	
	Employee()
	{
		salary = 50000;
	}
	
	public void printSalary()
	{
		System.out.println("Employee Salary is: "+salary);
	}
	
	@Override
	public void contNumber()
	{
		super.contNumber(); // super matlab Upar
		System.out.println("Contact number of Employee");
	}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.printSalary();
		emp.printName();
		emp.contNumber();

	}

}
