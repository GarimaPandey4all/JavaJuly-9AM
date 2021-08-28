package com.brainmentors.java.exceptionhandling;

public class ExceptionDemo {
	
	//finally: finally is a block which always execute.
	
	static void dao() throws ArithmeticException
	{
		System.out.println("Connection Open...");
		try {
			int s = 100 / 0;
			System.out.println("Query and Get the Result");
			System.out.println("Send Result to Helper");
		}
		finally {
			//resource clean up code
			System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException
	{
		System.out.println("Call DAO");
		dao();
		System.out.println("Get Result from DAO");
		System.out.println("Send Result to View");
	}
	
	static void view()
	{
		System.out.println("Call Helper");
		try
		{
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Some Problem in DAO");
			System.exit(0); // exit the program
			//return;
			//e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Connect to Admin");
			System.exit(0);
		}
		System.out.println("Get Result from Helper");
		System.out.println("Print Result to User");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		view();
	}

}
