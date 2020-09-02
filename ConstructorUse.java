
public class ConstructorUse {
	
	int a;
	String name;  //instance variable
	
	ConstructorUse(int a,String name)  //local variable 
	{
		this.a=a;  //this clear the confusion when Local and Instance variables name are same, and it refer to instance variable
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		//ConstructorUse obj=new ConstructorUse(5,"PramitiTech");
		
		Environment obj=new Environment("PramitiTech", "Password", "Selenium", "Chrome");
		Environment obj2=new Environment("PramitiTech", "Password", "Selenium", "FireFox");
		Environment obj3=new Environment("PramitiTech", "Password", "Selenium", "InternetExplorer");

	//	System.out.println(obj.a);
	//	System.out.println(obj.name);
		
	}

}
