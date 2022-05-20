package org.read;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSample {
	public static void main(String[] args) throws IOException {
		//1.File location
		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\Book1.xlsx");
		
		//2.Readfile
		FileInputStream fin =new FileInputStream(f);
		
		//3.fetch a workbook
		Workbook b = new XSSFWorkbook(fin);
		
		//4.fetch a sheet
		Sheet sh = b.getSheet("Login");
		
		//5.fetch a row
		Row r = sh.getRow(3);
		
		//6.fetch a cell
		Cell c = r.getCell(1);
		System.out.println(c);
		
		
		
		
		
		
		
		
	}

}
