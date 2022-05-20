package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionPage1 extends BaseClass {

	// non paramaterized constructer
	public AdactionPage1() {
		PageFactory.initElements(driver, this);
	}

	// private webelement
	@FindBy(name = "location")
	private WebElement locat;

	@FindBy(name = "hotels")
	private WebElement hotel;

	@FindBy(name = "room_type")
	private WebElement room;

	@FindBy(id = "Submit")
	private WebElement roomno;

	// generate getters
	public WebElement getLocat() {
		return locat;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

}
