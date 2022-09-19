package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends BaseClass{
	
		public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Create New Account']")
	private WebElement newAcc;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement LastName;
	
	@FindBy(name="reg_email__")
	private WebElement mobNum;
	
	@FindBy(id="password_step_input")
	private WebElement newPass;
	
	@FindBy(xpath="(//option[@value='7'])[1]")
	private WebElement day;
	
	@FindBy(xpath="(//option[@value='1'])[2]")
	private WebElement month;
	
	public WebElement getMobNum() {
		return mobNum;
	}

	public WebElement getNewPass() {
		return newPass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	@FindBy(xpath="//option[@value='1993']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signBtn;	
	
	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getNewAcc() {
		return newAcc;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSignBtn() {
		return signBtn;
	}

		

}
