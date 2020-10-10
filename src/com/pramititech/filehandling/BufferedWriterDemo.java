package com.pramititech.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		FileWriter obj=new FileWriter("D:\\JavaFile\\Text\\PramitiTech.csv",true);
		BufferedWriter obj2=new BufferedWriter(obj);
		obj2.newLine();
		obj2.write("Python,and,Selenium,is,a,Awesome,Course");
//		obj2.write("Java and Selenium is a Awesome Course!");
//		obj2.newLine();
//		obj2.write("Performance with Jmeter is also a Awesome Course!");
		obj2.flush();
//		System.out.println("File Successfully written!");
	}
	

	

}
