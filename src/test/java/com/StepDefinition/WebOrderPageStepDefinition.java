package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebOrderPageStepDefinition extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();

	@Given("User has Launched Chrome Browser")
	public void user_has_launched_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome browser has launched");
	}
	
	@Given("User has Launched Edge Browser")
	public void user_has_launched_edge_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome browser has launched");
	}

	@When("User Navigate to Sign In Page of WebOrder Application")
	public void user_navigate_to_sign_in_page_of_web_order_application() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@When("User enters valid username and password in weborder login page")
	public void user_enters_valid_username_and_password_in_weborder_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}

	@When("User Click on Login Button in from weborder login page")
	public void user_click_on_login_button_in_from_weborder_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be logged in and List of All Orders page should display")
	public void user_should_be_logged_in_and_list_of_all_orders_page_should_display() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//h2[normalize-space()='List of All Orders']")).isDisplayed();
	}

	@When("User click on Logout link from the home page")
	public void user_click_on_logout_link_from_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_logout")).click();
	}
	@Then("user should be taken back to Login page.")
	public void user_should_be_taken_back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
		driver.close();
	}


	
	@When("User Navigate to Sign In Page of Spree Application")
	public void user_navigate_to_sign_in_page_of_spree_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demo.spreecommerce.org/");
		driver.findElement(By.id("account-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("LOGIN")).click();
		
		
	}
	@When("User enters valid username and password in Spree login page")
	public void user_enters_valid_username_and_password_in_spree_login_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("spree_user_email")).sendKeys("minh@spree.com");
		driver.findElement(By.id("spree_user_password")).sendKeys("123456");
	   
	}
	@When("User Click on Login Button in from Spree login page")
	public void user_click_on_login_button_in_from_spree_login_page() {
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}
	
	@Then("User should be logged in and My Account page should display")
	public void user_should_be_logged_in_and_my_account_page_should_display() {
	    driver.findElement(By.xpath("//span[text()='Logged in successfully']")).isDisplayed();
	}


	@When("User click on Logout link from the account page of Spree")
	public void user_click_on_logout_link_from_the_account_page_of_spree() throws InterruptedException {
		driver.findElement(By.id("account-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("LOGOUT")).click();
	}
	@Then("user should be taken back to home page of Spree.")
	public void user_should_be_taken_back_to_home_page_of_spree() {
		driver.findElement(By.xpath("//span[text()='Signed out successfully.']")).isDisplayed();
		driver.close();
	}




}
