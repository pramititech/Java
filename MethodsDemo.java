public class MethodsDemo
{

void sum(int a, int b){
	int c= a+b;
	System.out.println("Sum of two number :"+c);
}


void sub(int a, int b){
	int c= a-b;
	System.out.println("Difference of two number :"+c);
}

int multiply(int a, int b){
	int c= a*b;
	//System.out.println("Multiplication of two number :"+c);
	return c;
}

public static void main(String[] args) {
	
	MethodsDemo obj=new MethodsDemo();
	obj.sub(10, 20);
	obj.sum(10, 20);
	int a = obj.multiply(10, 20);
	System.out.println("Multiplication of 2 no :"+a);

	
	
	
}
}