package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateAndModifiy {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\Exc.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook b= new XSSFWorkbook(fin);
		
		Sheet sh = b.getSheet("Register");
		
		Row r = sh.getRow(3);
		
		Cell c = r.getCell(1);
		
		String s = c.getStringCellValue();
		if (s.startsWith("Sma")) {
			c.setCellValue("Nithish");
		}else {
			c.setCellValue("Arav");
		}
		
		FileOutputStream fo = new FileOutputStream(f);
		b.write(fo);
		
		
		
		System.out.println("Finish");
		
		
	}

}
