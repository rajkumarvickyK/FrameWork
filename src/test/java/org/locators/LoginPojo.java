package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	// non paramaterized constructer
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	// private webelement
	@FindBy(id = "email")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLog;
     
      //  generate getters
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLog() {
		return btnLog;
	}
	
	

}
