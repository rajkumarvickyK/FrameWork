package org.locators;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionLogin extends BaseClass {

	// non paramaterized constructer
	public AdactionLogin() {
		PageFactory.initElements(driver, this);

	}

	// private webelement
	@FindBy(id = "username")
	private WebElement txtUser;

	@FindBy(name = "password")
	private WebElement txtpass;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement btnclk;

	// generate getters

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnclk() {
		return btnclk;
	}

}
