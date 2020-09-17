package com.pramititech.java;
public class Employee
{
		String name;  //Instance Variable ,Data Members ,States
		int salary;
		int empid;
		
		 Employee()
		{
					}
		 
		 Employee(int a , int b)
		 {
		 }
		
		String teaching()
		{
			String course="Java";
			return course;
		}
		
		public static void main(String[] args) {
			
			Employee obj=new Employee();
		}
}