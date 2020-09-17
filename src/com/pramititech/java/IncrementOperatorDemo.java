package com.pramititech.java;
public class IncrementOperatorDemo {
	public static void main(String[] args) {
		int i=5;

		i=--i+ i--+ ++i+ ++i;
		System.out.println("Value of i is "+i);
		
	}
}