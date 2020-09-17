package com.pramititech.typecast;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char c='A';
//		int i=c;
//		System.out.println(i);
//		
//		double d=20.0;
//		int j=(int) d;
//		System.out.println(j);
//		
//		int k =40;
//		double d2=k;  //implicit casting/widening conversion/upcasting
//		System.out.println(d2);
		
		double l=300.0009;
		byte b=(byte)l;
		System.out.println(b);  //explicit casting/downcasting/narrowing coonversion
		
		System.out.println(Integer.toBinaryString(300));
		

	}

}
