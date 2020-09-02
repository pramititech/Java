
public class MethodOverloadingDemo {
	
	void load(int load1)
	{
		System.out.println("Walks 10 Km");
	}
	
	void load(int load1,String load2)
	{
		System.out.println("Walks 5 Km");
	}
	
	
	void load(String load2,int load1)
	{
		System.out.println("Walks 1 Km");
	}
	
	int load(int load1,int load2,int load3)
	{
		System.out.println("Walks 2.5 Km");
		return load1;
	}
//	void load(int load)
//	{
//		System.out.println("Wlaks 10 Km");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		obj.load(10);
		obj.load(10, "WaterBottle");
		

	}

}
