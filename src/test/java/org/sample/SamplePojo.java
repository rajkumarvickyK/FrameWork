package org.sample;

import java.io.IOException;

import org.helper.BaseClass;

import org.locators.LoginPojo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePojo extends BaseClass {
	public static void main(String[] args) throws IOException {

		openChromeBrowser();
		maxWindow();
		launchUrl("https://www.facebook.com/");
		toFetchTitle();
		toFetchUrl();

		impilicitWait();

		LoginPojo l1 = new LoginPojo();
		WebElement user = l1.getTxtEmail();
		fillTextBox(user, readFromExcel("Book1", "Login", 2, 1));

		WebElement pass = l1.getTxtPass();
		fillTextBox(pass, readFromExcel("Book1", "Login", 2,2));

		WebElement btnLog = l1.getBtnLog();
		toClk(btnLog);

	}

}
