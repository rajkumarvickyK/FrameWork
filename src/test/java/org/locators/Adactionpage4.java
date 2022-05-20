package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactionpage4 extends BaseClass {
	
	public Adactionpage4() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="order_no")
	private WebElement orderNum;


	public WebElement getOrderNum() {
		return orderNum;
	}
	

}
