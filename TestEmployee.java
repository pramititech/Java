
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		//search/select /get
		System.out.println("Employee Name :"+obj.name);
		System.out.println("Employee Salary :"+obj.salary);
		System.out.println("Employee ID :"+obj.empid);
		
		//update
		obj.name="Vikrant";
		obj.salary=20000;
		obj.empid=123456;
		System.out.println("**********************************************");
		System.out.println("Employee Name :"+obj.name);
		System.out.println("Employee Salary :"+obj.salary);
		System.out.println("Employee ID :"+obj.empid);

	}

}
