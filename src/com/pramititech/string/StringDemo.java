package com.pramititech.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Vikrant";
String s2="Upadhyay";
s1.concat(s2);
System.out.println(s1);

String s3=s1.concat(s2);
System.out.println(s3);

String s4="abc";
String s5="abc";
String s6="abc";

s4="pqr";  //String is immutable 

//if String is mutable , then O/P : pqr , pqr ,pqr
//for better maintenance

System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
	}

}
