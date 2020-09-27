package com.pramititech.polymorphism;

public class RBIAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayBank obj=new DisplayBank();
		obj.contactBank(new HDFC());  // Loosely Coupled
		obj.contactBank(new SBI());  // Loosely Coupled
		

	}

}
