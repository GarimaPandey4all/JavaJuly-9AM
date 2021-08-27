package com.brainmentors.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Connection Open...");
		System.out.println("DB Query....");
		try {
			
			String path = "E:\\Java\\JavaJulyEclipse_9AM\\FileInput123\\abcd.txt";
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes this file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created");
			}
			
			/*
			String name = null;
			name.toUpperCase();
			int arr[] = new int[10];
			arr[11] = 100;
			int d = 10 / 0; // throw new ArithmeticException();
			*/
		}
		
		catch(IOException e)
		{
			System.out.println("File can't be create...");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You divide a number with zero "+e);
			//return;
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound (Size)");
			return;
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the DB Connection");

	}

}
