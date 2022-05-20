package org.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelWrite {
	public static void main(String[] args) throws IOException {

		// File location
		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\Exc.xlsx");

		// Create Workbook
		Workbook b = new XSSFWorkbook();

		// Create Sheet
		Sheet sh = b.createSheet("Register");

		// Create Row
		Row r1 = sh.createRow(0);
		Row r2 = sh.createRow(1);

		// Create 0th row Cell
		Cell c1 = r1.createCell(0);
		Cell c2 = r1.createCell(1);
		Cell c3 = r1.createCell(2);
		// Create 0th row Cell Value
		c1.setCellValue("Firstname");
		c2.setCellValue("Lastname");
		c3.setCellValue("DOB");

		// Create 1th row Cell
		Cell c4 = r2.createCell(0);
		Cell c5 = r2.createCell(1);
		Cell c6 = r2.createCell(2);
		// Create 1th row Cell Value
		c4.setCellValue("Rajkumar");
		c5.setCellValue("Vicky");
		c6.setCellValue("16-04-1994");

		// Write in a file

		FileOutputStream fo = new FileOutputStream(f);
		b.write(fo);
		System.out.println("finish");

	}

}
