package Stepdef;

import Utilities.TestUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SharedClass
{
	public RequestSpecification req;
	public Response res;
	public Scenario s;
	public TestUtility tu;

   @Before 
   public void method1(Scenario s)
   {
	   this.s=s; 
	   
   }
   @After 
   public void method2()
   {
	   s.log(s.getName()+ "\s is"  +s.getStatus().name());
   }
}
