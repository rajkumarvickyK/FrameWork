package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionPage3 extends BaseClass {
	// non paramaterized constructer
	public AdactionPage3() {
		PageFactory.initElements(driver, this);

	}

	// private webelement
	@FindBy(id = "first_name")
	private WebElement first;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement last;

	@FindBy(name = "address")
	private WebElement Address;

	@FindBy(name = "cc_num")
	private WebElement ccno;

	@FindBy(name = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(name = "cc_exp_year")
	private WebElement cctyear;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement book;

	// geters generate

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getCctyear() {
		return cctyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
