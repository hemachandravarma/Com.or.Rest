package Stepdef;

import org.testng.Assert;

import Utilities.TestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class GetAllPosts
{
	public SharedClass sh;
	
	public GetAllPosts(SharedClass shObj)
	{
		this.sh=shObj;
	}
	
	@Given("Register end point")
	public void register_end_point() throws Exception 
	{
		String u=TestUtility.getValueInPropertiesFile("URI");
		RestAssured.baseURI=u;
		
	}
	@Given("define HTTP method")
	public void define_http_method() 
	{	
	    sh.req=RestAssured.given();
	}

	@When("Submit request via GET Method to restful service")
	public void submit_request_via_get_method_to_restful_service() 
	{
	  sh.res=sh.req.when().get();
	
	}

	@Then("Statuscode is {string} and content type is:")
	public void statuscode_is_and_content_type_is(String sc, String ct) 
	{
	    int esc=Integer.parseInt(sc);
	    
	    if(sh.res.statusCode()==esc && sh.res.getHeader("Content-Type").contains(ct)) 
	    {
	    	sh.s.log("Test Passed");
	    	Assert.assertTrue(true);
	    }else 
	    {
	    	sh.s.log("test failed");
	    	Assert.assertTrue(false);
	    }
	}
	@When("Submit request for id {string} via GET Method to restful service")
	public void submit_request_for_id_via_get_method_to_restful_service(String id) 
	{
	    sh.req=RestAssured.given().basePath(id);
	}

	@Then("Statuscode is {string} and id is {string}")
	public void statuscode_is_and_id_is(String sc, String id) 
	{
	   sh.res=sh.req.when().get();
	}

}
