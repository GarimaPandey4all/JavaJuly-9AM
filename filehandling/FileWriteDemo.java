package com.brainmentors.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Data to Write in a File:");
		Scanner scanner = new Scanner(System.in);
		
		String txt = scanner.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\sample2.txt");
		
		fo.write(txt.getBytes());
		
		fo.close();
		
		System.out.println("Data Write in a File");

	}

}
