package com.pramititech.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
	
		/*
//		 * Create File
//		 */
//		File f=new File("D:\\JavaFile\\Text\\PramitiTech.txt");
//		File f1=new File("D:\\JavaFile\\Text");
//
//			f1.mkdirs();
//			if (f1.exists())
//			{
//			f.createNewFile();
//			}
//		System.out.println(f.exists());
//		System.out.println(f1.exists());
//		
//	
		/*
		 * Write File
//		 */
		FileWriter f = null ;
		try {
			f= new FileWriter("D:\\JavaFile\\Text\\Vikrant.txt",true);
			f.write("Java and Selenium Course is Awesome!");
	
		} finally {
			// TODO: handle finally clause
			f.flush();
			System.out.println("Successfully Flushed!");
		}
		System.out.println("File Write Successful!");

	}
}
