package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@smoketest")
	  public void beforeValidation()
	  {
		System.out.println("Before is invoked before smoketest");
	  }
	
	@After("@smoketest")
	  public void afterValidation()
	  {
		System.out.println("After is invoked after smoketest is validated");
	  }
	
}
