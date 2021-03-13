import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		dr = new ChromeDriver();
	   
	}

	@Given("^navigate to URL$")
	public void navigate_to_URL() throws Throwable {
		dr.get("http://www.faceook.com");

	}

	@When("^User type userID in userID textBox$")
	public void user_type_userID_in_userID_textBox() throws Throwable {
	   dr.findElement(By.id("email")).sendKeys("__your email___");
	}

	@When("^user type password in passwordBox$")
	public void user_type_password_in_passwordBox() throws Throwable {
		dr.findElement(By.id("pass")).sendKeys("your pass");	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   dr.findElement(By.id("u_0_2")).click();
	   
	}

	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	if(dr.findElement(By.id("signout")).isDisplayed()) {
		System.out.println("i am in profile page");
	}
	else
		System.out.println("i am not in profile page");
	  
	}

}
