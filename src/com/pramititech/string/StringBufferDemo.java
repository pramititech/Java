package com.pramititech.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1=new StringBuffer("abc");
StringBuffer s2=new StringBuffer("pqr");
s1.append(s2);
System.out.println(s1);


StringBuilder s3=new StringBuilder("abc");

StringBuilder s4=new StringBuilder("pqr");

s3.append(s4);
System.out.println(s3);
	}

	

}
