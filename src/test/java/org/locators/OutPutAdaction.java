package org.locators;

import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OutPutAdaction extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		openChromeBrowser();
		maxWindow();
		launchUrl("https://adactinhotelapp.com/");
		toFetchTitle();
		toFetchUrl();
		impilicitWait();
		//LoginPage
		AdactionLogin l = new AdactionLogin();
		WebElement user = l.getTxtUser();
		fillTextBox(user, readFromExcel("HotelDetails", "Sheet1", 1, 0));
		
		WebElement pass = l.getTxtpass();
		fillTextBox(pass, readFromExcel("HotelDetails", "Sheet1", 1, 1));
		
		WebElement btnclk = l.getBtnclk();
		toClk(btnclk);
		
		//Page1
		AdactionPage1 l1 = new AdactionPage1();
		WebElement locat = l1.getLocat();
		dropDownByIndex(locat, 5);
		WebElement hot = l1.getHotel();
		dropDownByIndex(hot, 2);
		WebElement room = l1.getRoom();
		dropDownByIndex(room, 2);
		WebElement sumit = l1.getRoomno();
		toClk(sumit);
		
		//Page2
		AdactionPage2 l2=new AdactionPage2();
		WebElement radiobtn = l2.getRadiobtn();
		toClk(radiobtn);
		WebElement clkbtn = l2.getClkbtn();
		toClk(clkbtn);
		
		//Page3
		AdactionPage3 l3= new AdactionPage3();
		WebElement first = l3.getFirst();
		fillTextBox(first, readFromExcel("HotelDetails", "Sheet1", 1, 2));
		WebElement lastname = l3.getLast();
		fillTextBox(lastname, readFromExcel("HotelDetails", "Sheet1", 1, 3));
		WebElement address = l3.getAddress();
		fillTextBox(address, readFromExcel("HotelDetails", "Sheet1", 1, 5));
		WebElement creditno = l3.getCcno();
		fillTextBox(creditno, readFromExcel("HotelDetails", "Sheet1", 1, 6));
		WebElement credittype = l3.getCctype();
		dropDownByIndex(credittype, 2);
		WebElement month = l3.getMonth();
		dropDownByIndex(month, 4);
		WebElement year = l3.getCctyear();
		dropDownByIndex(year, 5);
		WebElement cvv = l3.getCvv();
		fillTextBox(cvv, readFromExcel("HotelDetails", "Sheet1", 1, 7));
		WebElement book = l3.getBook();
		toClk(book);
		tosleep(2000);
		
		//page4
		Adactionpage4 l4=new Adactionpage4();
		WebElement orderNum = l4.getOrderNum();
	System.out.println("Order No: " +getValue(orderNum, "value"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
