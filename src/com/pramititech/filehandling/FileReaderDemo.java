package com.pramititech.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader f=new FileReader("D:\\JavaFile\\Text\\PramitiTech.csv");
		int i;
		int j=0;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
			j++;
		}
		System.out.println("Loop done");
		System.out.println(j);
		
		//List Files in afolder
		File fobj=new File("D:\\JavaFile\\Text");
		File[] f1=fobj.listFiles();
		
		for(File list:f1)
		{
			System.out.println(list);
		}
		
	}

}
