package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionPage2 extends BaseClass {
	// non paramaterized constructer
	public AdactionPage2() {
		PageFactory.initElements(driver, this);
	}
	// private webelement

	@FindBy(name = "radiobutton_0")
	private WebElement radiobtn;

	@FindBy(name = "continue")
	private WebElement clkbtn;

	// geters generate
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}

}
