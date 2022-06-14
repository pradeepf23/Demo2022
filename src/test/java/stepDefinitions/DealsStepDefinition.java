package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {

	
	
@SmokeTest
@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
   System.out.println("step1");
   
}
@RegressionTest
@When("^user validate home page title$")
public void user_validate_home_page_title() throws Throwable {
	System.out.println("step2");
   
}
@SmokeTest
@Then("^user enters username and password$")
public void user_enters_username_and_password() throws Throwable {
	System.out.println("step3");
  
}
@SmokeTest
@Then("^user cliks on signin button$")
public void user_cliks_on_signin_button() throws Throwable {
	System.out.println("step3");
   

}
@SmokeTest @RegressionTest
@Then("^user enters username and password$")
public void user_Test1() throws Throwable {
	System.out.println("step3");
  
}
@RegressionTest
@Then("^user enters username and password$")
public void user_Test2() throws Throwable {
	System.out.println("step3");
  
}
@SmokeTest
@Then("^user enters username and password$")
public void user_Test3() throws Throwable {
	System.out.println("step3");
}
@RegressionTest
@Then("^user enters username and password$")
public void user_Test4() throws Throwable {
	System.out.println("step3");
  
}



}
