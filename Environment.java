
public class Environment {

String username;
String password;
String driver;
String browser;

Environment(String username,String password,String driver,String browser)
{
 this.username=username;
 this.password=password;
 this.driver=driver;
 this.browser=browser;
 
 System.out.println("Environmet UserName set to :"+ this.username);
 System.out.println("Environmet Password set to :"+ this.password);
 System.out.println("Environmet driver set to :"+ this.driver);
 System.out.println("Environmet browser set to :"+ this.browser);
 System.out.println("*******************************************");
}

Environment(String driver,String browser)
{

 this.driver=driver;
 this.browser=browser;

 System.out.println("Environmet driver set to :"+ this.driver);
 System.out.println("Environmet browser set to :"+ this.browser);
 System.out.println("*******************************************");
}

}
