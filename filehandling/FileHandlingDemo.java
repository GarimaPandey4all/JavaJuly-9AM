package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".mp3");
	}
	
}

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		File Handling:

		Streams - flow of data

		1. Text ->Reader, Writer (abstract)
		2. Byte ->InputStream, OutputStream (abstract)
		*/
		
		String path = "E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\sample2.txt");
			file.renameTo(file2);
			//file.delete();
			//System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		path = "E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\abcd\\xyz\\var\\tt";
		
		file = new File(path);
		//file.mkdir();	
		file.mkdirs();
		
		file = new File("E:\\Java\\JavaJulyEclipse_9AM\\FileInput\\songs");
		MyFilter filter = new MyFilter();
		//File files[] = file.listFiles(filter);
		
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp3"));
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		
		System.out.println("No of Files: "+files.length);
		System.out.println("No of Files: "+files2.length);

	}

}
