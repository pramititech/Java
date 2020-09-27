package com.pramititech.encapsulation;

import java.util.Scanner;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj=new EncapsulationDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		
		//DB Operation //Update , insert ,create
		obj.setAge(age);
		obj.setId(id);
		obj.setName(name);
		obj.setSalary(salary);
		
		//DB Search
		System.out.println(" Employee Name is "+obj.getName());
		System.out.println(" Employee Age is "+obj.getAge());
		System.out.println(" Employee Salary is "+obj.getSalary());
		System.out.println(" Employee Id is "+obj.getId());

	}

}
