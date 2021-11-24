package stepDefinition;



import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
  
	
	 @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable 
	    {
	      System.out.println("navigated to netbanking page");
	      
	      
	      System.out.println("xfgvdfgds");
	      System.out.println("2nd line in develop branch");
	      System.out.println("3rd line in develop branch");
	    }

	 @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	 	{
	    	System.out.println(strArg1);
	    	System.out.println(strArg2);
	    	//
	    	System.out.println("another change in develop branch");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable
	    {
	    	System.out.println("home page is accessible");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable
	    {
	    	System.out.println("All cards are displayed");
	    	
	    	System.out.println("All cards are displayed again");
	    	
	    	
	    	System.out.println("All cards are displayed againm2");
	    }
	    
	    @When("^User login into application with following details$")
	    public void user_login_into_application_with_following_details(DataTable data) throws Throwable 
	    {
	    	List<List<String>> obj = data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	    	
	    }
	    
	    @When("^User login in to the application with (.+) and (.+)$")
	    public void user_login_in_to_the_application_with_and(String username, String password) throws Throwable 
	    {
	        System.out.println(username);
	        System.out.println(password);
	    }	
}
