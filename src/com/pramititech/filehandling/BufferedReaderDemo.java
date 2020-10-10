package com.pramititech.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader f=new FileReader("D:\\JavaFile\\Text\\PramitiTech.csv");
		BufferedReader b=new BufferedReader(f);
		String s;
		while ((s=b.readLine())!=null)
		{
			if(s.contains("Java"))
			{
			System.out.println("Provided text is present");
			break;
			}
			else
			{
				System.out.println("Provided text is not present");
			}

		}
//	String str=Files.readAllLines(Paths.get("D:\\JavaFile\\Text\\PramitiTech.csv")).get(1);
//	System.out.println(str);
//	
//	 boolean resp = Files.readAllLines(Paths.get("D:\\JavaFile\\Text\\PramitiTech.csv")).get(0).contains("Python");
//	 if (resp)
//	 {
//	System.out.println("Provided text is present");
//	}
//	else {
//		
//		System.out.println("Provided text is not present");
//	}
}
}
