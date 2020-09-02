
public class TestScriptExecutor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote obj=new Remote();
		
		//Environment obj=new Environment("WebDriver",Browser,Crdentials);
		obj.switchon();
		obj.switchoff();
		
		
		
		System.out.println("Remote Color is "+obj.remoteColor);
		System.out.println("Remote Size is "+obj.remoteSize);
		System.out.println("Remote Keys are "+obj.remoteKeys);

		
		Remote obj2=new Remote();
		
		obj2.switchon();
		obj2.switchoff();
		
		
		
		System.out.println("Remote Color is "+obj2.remoteColor);
		System.out.println("Remote Size is "+obj2.remoteSize);
		System.out.println("Remote Keys are "+obj2.remoteKeys);
		
	}

}
