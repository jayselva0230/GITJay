package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass extends BaseClass {
	
	public ForgetPass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forpass;
	
	@FindBy(id="identify_email")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@name='did_submit']")
	private WebElement searchbtn;
	
	public WebElement getForpass() {
		return forpass;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	

}

