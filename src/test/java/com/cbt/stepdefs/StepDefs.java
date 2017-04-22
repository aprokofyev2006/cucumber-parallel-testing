package com.cbt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {
	
	private WebDriver driver;
	public StepDefs(SharedDriver sharedDriver){
		driver = sharedDriver;
	}
	
	@Given("^User on home page$")
	public void User_on_home_page() throws Throwable {
	   // go to google
		driver.get("http://google.com");
	}

	@Then("^User should be able to (.*)$")
	public void User_should_be_able_to_login(String option) throws Throwable {
	   // search
		driver.findElement(By.name("q")).sendKeys(option);
		Thread.sleep(2000);
		//comment
	}

//	@Then("^User should be able to order one$")
//	public void User_should_be_able_to_order_one() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}
//
//	@Then("^User should be able to registration$")
//	public void User_should_be_able_to_registration() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}
//
//	@Then("^User should be able to search one$")
//	public void User_should_be_able_to_search_one() throws Throwable {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}

}
