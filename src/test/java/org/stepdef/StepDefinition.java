package org.stepdef;

import org.helper.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pojo.ForgetPass;
import org.pojo.LoginPojo;
import org.pojo.SignUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	WebDriver driver;
	LoginPojo l;
	ForgetPass f;
	SignUp s;
	
	@Given("User have to enter facebook login through chrome browser")
	public void user_have_to_enter_facebook_login_through_chrome_browser() {
		
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();
	    
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		l=new LoginPojo();
	     WebElement email = l.getTxtEmail();
	     fill(email, "ramya@gmail.com");
	     WebElement pass = l.getTxtPass();
	     fill(pass, "7877687687");
 	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		 l=new LoginPojo();
		WebElement btnLogin = l.getBtnLogin();
		btnLogin.click();
		Thread.sleep(4000);

	}

	@Then("User have to close the page")
	public void user_have_to_close_the_page() {
	    closeBrowser();
	}
	
	@When("User have to click the forget password")
	public void user_have_to_click_the_forget_password() throws InterruptedException {
	    f = new ForgetPass();
	    WebElement forpass = f.getForpass();
	    forpass.click();
	    Thread.sleep(4000);
	}

	@When("user have to enter the phone number")
	public void user_have_to_enter_the_phone_number() {
	    f = new ForgetPass();
	   WebElement searchbox = f.getSearchbox();
	   fill(searchbox, "9876543211");
	   
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
	   f = new ForgetPass();
	   WebElement searchbtn = f.getSearchbtn();
	   searchbtn.click();
	}
	
	@When("User have to click create new account button")
	public void user_have_to_click_create_new_account_button() throws InterruptedException {
	    s = new SignUp();
	   WebElement newAcc = s.getNewAcc();
	   newAcc.click();
	   Thread.sleep(4000);
	}

	@When("User have to pass first name")
	public void user_have_to_pass_first_name() {
	     s = new SignUp();
	    WebElement firstName = s.getFirstName();
	    fill(firstName, "Ramya");
    }
	
	@When("User have to pass last name")
	public void user_have_to_pass_last_name() {
	     s= new SignUp();
	    WebElement lastName = s.getLastName();
	    fill(lastName, "jayanthi");
	    
	}
	
	@When("User have to pass mob number and new password")
	public void user_have_to_pass_mob_number_and_new_password() {
		s= new SignUp();
		WebElement mobNum = s.getMobNum();
		fill(mobNum,"9845676546");
		
		WebElement newPass = s.getNewPass();
		fill(newPass, "karthik");
	}

	@When("User have to give DOB and gender")
	public void user_have_to_give_DOB_and_gender() throws InterruptedException {
		s= new SignUp();
		WebElement day = s.getDay();
		day.click();
		WebElement month = s.getMonth();
		month.click();
		WebElement year = s.getYear();
		year.click();
		Thread.sleep(4000);
		WebElement gender = s.getGender();
		gender.click();
	
	}


	@Then("User have to click signup button")
	public void user_have_to_click_signup_button() {
	     s = new SignUp();
	    WebElement signBtn = s.getSignBtn();
	    signBtn.click();
	    
	}



}
