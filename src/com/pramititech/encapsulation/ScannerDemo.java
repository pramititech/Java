package com.pramititech.encapsulation;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Age :");
		int a=scn.nextInt(); 
		System.out.println("Enter Response :");
		scn.nextLine();
		String b=scn.nextLine();
		System.out.println("Age is "+a);
		System.out.println("Response is "+b);

	}

}
