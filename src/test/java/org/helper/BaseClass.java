package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static JavascriptExecutor js;
	public static TakesScreenshot tk;
	public static Select s;

	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public static void openFireFoxbrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}
	public static void openEdgebrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void toFetchTitle() {
		String titlename = driver.getTitle();
		System.out.println(titlename);

	}

	public static void toFetchUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void toRefresh() {
		driver.navigate().refresh();

	}

	public static void tosleep(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	public static void impilicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void getdateAndTime() {
		Date d = new Date();
		System.err.println(d);

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void toClk(WebElement ref) {
		ref.click();
	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void past() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void tab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void rightClick(WebElement elem) {
		a = new Actions(driver);
		a.contextClick(elem).perform();
	}

	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void moveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

	public static void toPrint(String string) {
		System.out.println(string);
	}

	public static void scrollDown(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	public static void scrollUp(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(false)", ele);

	}

	public static void takeScreenShot(String picname) throws IOException {
		tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\ScreenShots\\" + picname + ".png");
		FileUtils.copyFile(s, d);

	}

	public static void dropDownSelectByValue(WebElement ele, String value) {
		s = new Select(ele);
		s.selectByValue(value);

	}

	public static void dropDownByIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);

	}

	public static String getValue(WebElement ref, String attributename) {
		String print = ref.getAttribute(attributename);
		return print;

	}

	public static String readFromExcel(String fileName, String SheetName, int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\" + fileName + ".xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook b = new XSSFWorkbook(fin);

		Sheet s = b.getSheet(SheetName);

		Row r = s.getRow(rowNo);

		Cell c = r.getCell(cellNo);

		int type = c.getCellType();
		String data;

		if (type == 1) {
			data = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM dd,yyyy");
			data = sim.format(da);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			data = String.valueOf(l);
		}

		return data;

	}

	public static void readFile(String fileName, String SheetName, int Row, int Cell) throws IOException {
		// 1.File location
		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\" + fileName + ".xlsx");

		// 2.Readfile
		FileInputStream fin = new FileInputStream(f);

		// 3.fetch a workbook
		Workbook b = new XSSFWorkbook(fin);

		// 4.fetch a sheet
		Sheet sh = b.getSheet(SheetName);

		// 5.fetch a row
		Row r = sh.getRow(Row);

		// 6.fetch a cell
		Cell c = r.getCell(Cell);
		System.out.println(c);

	}

}
