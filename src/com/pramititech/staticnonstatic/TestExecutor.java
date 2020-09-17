package com.pramititech.staticnonstatic;

public class TestExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee("Vikrant",123);
		obj.display();
		Employee obj2=new Employee("Ankita",124);
		obj2.display();
		Employee obj3=new Employee("Tejeshwar",125);
		obj3.display();

	}

}

class Employee
{
	String empname;
	int empid;
	static String companyName="PramitiTech";
	
	Employee(String name,int id)
	{
		empname=name;
		empid=id;
	}
	
	void display()
	{
		System.out.println("Employee Name :"+empname+"\nEmployeeId :"+empid+"\nEmployee Company :"+companyName);
	}
}
