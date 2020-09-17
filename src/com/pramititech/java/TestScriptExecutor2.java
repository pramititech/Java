package com.pramititech.java;

public class TestScriptExecutor2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeDemo obj=new EmployeeDemo();
//		obj.working();
//		System.out.println("Bonue to Employees"+obj.bonus);
		
		System.out.println("******************************");
		System.out.println("Developer Profile :");
		Developer obj2=new Developer();
		obj2.status();
		obj2.development();
		obj2.giveHealthInsurance();
		System.out.println("Bonus to Developer"+obj2.bonus);
		System.out.println("Salary of Developer"+obj2.salary);

		
		System.out.println("******************************");
		System.out.println("tester Profile :");
		TesterDemo1 obj3=new TesterDemo1();
		obj3.status();
		obj3.testing();
		obj3.giveHealthInsurance();
		System.out.println("Bonus to Tester"+obj3.bonus);
		System.out.println("Salary of Tester"+obj3.salary);
	}

}
