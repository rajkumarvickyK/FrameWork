package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactInHotel extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		openChromeBrowser();
		maxWindow();
		launchUrl("https://adactinhotelapp.com/");
		WebElement txtuser = driver.findElement(By.id("username"));
		fillTextBox(txtuser, "rajkumarvicky");
		WebElement txtpass = driver.findElement(By.id("password"));
		fillTextBox(txtpass, "12345678");
		WebElement clk = driver.findElement(By.id("login"));
		toClk(clk);
		tosleep(2000);
		WebElement location = driver.findElement(By.name("location"));
		dropDownByIndex(location, 5);
		WebElement htl = driver.findElement(By.name("hotels"));
		dropDownByIndex(htl, 2);
		WebElement roomtyp = driver.findElement(By.name("room_type"));
		dropDownSelectByValue(roomtyp, "Double");
		WebElement submit = driver.findElement(By.name("Submit"));
		toClk(submit);
		tosleep(2000);
		WebElement btn = driver.findElement(By.name("radiobutton_0"));
		toClk(btn);
		WebElement clkbtn = driver.findElement(By.name("continue"));
		toClk(clkbtn);
		WebElement first = driver.findElement(By.name("first_name"));
		fillTextBox(first, "Rajkumar");
		WebElement last = driver.findElement(By.name("last_name"));
		fillTextBox(last, "Kalai");
		WebElement addres = driver.findElement(By.name("address"));
		fillTextBox(addres, "No:202,Vellalar Street,Kilkodungalore,vandavasi TK,TVmalai Dist.");
		WebElement cc = driver.findElement(By.name("cc_num"));
		fillTextBox(cc, "5123663215512366");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		dropDownByIndex(cctype, 2);
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		dropDownByIndex(ccmonth, 4);
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		dropDownByIndex(ccyear, 12);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		fillTextBox(ccv, "237");
		WebElement book = driver.findElement(By.id("book_now"));
		toClk(book);
		tosleep(10000);
		WebElement print = driver.findElement(By.name("order_no"));
		toPrint("Booking No:" +getValue(print, "value"));
	

	}

}
