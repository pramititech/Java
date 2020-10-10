package com.pramititech.collections;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i=new int[4];
		Scanner scn=new Scanner(System.in);
		int k ;
		
//		int[] i= {10,20,30,40};  //static initialization
		
		for (int j=0;j<4;j++)			
		{
			System.out.println("Enter value on index"+j);
			k =scn.nextInt();
			i[j]=k;
		}
//		i[0]=10;
//		i[1]=20;
//		i[2]=30;
//		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
	}

}
