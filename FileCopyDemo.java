package com.brainmentors.java.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String sourcePath = "E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\songs\\shapeofyou.mp3";
		String desPath = "E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\songs\\shapeofyouCopy.mp3";
		
		File file = new File(sourcePath);
		
		if(!file.exists())
		{
			System.out.println("Cant Copy File, Not Exist");
			return;
		}
		
		final int EOF = -1;
		
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(desPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Copy Start");
		
		int singleByte = bs.read();
		
		while(singleByte != EOF)
		{
			bo.write(singleByte);
			singleByte = bs.read();
		}
		
		bo.close();
		bs.close();
		fo.close();
		fs.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Data Copied  "+(endTime - startTime)+"ms");
	
	}

}
