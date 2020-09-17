package com.pramititech.inheritance;

public class VegetableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vegetables obj4=new Carrot();  //Upcasting
		Carrot obj5=(Carrot) obj4;
		obj5.chop();
		obj5.cook();
		System.out.println("*****************************************");
	//1 . Create Object of Parent Class and assign to Parent reference
		Vegetables obj=new Vegetables();
		obj.chop();
		obj.cook();
		//obj.prepareHalwa(); CE: we can that only parent members are accessed'
		System.out.println("*****************************************");
		//With child reference and object , we can access both parent and child members
		Carrot c=new Carrot();
		c.chop();
		c.cook();
		c.prepareHalwa();
		
		//Upcasting
		System.out.println("*****************************************");
		Vegetables obj1=new Carrot();
		obj1.chop();
		obj1.cook();

		

		
	}

}
