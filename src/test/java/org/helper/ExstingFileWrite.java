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

public class ExstingFileWrite {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\This PC\\eclipse-workspace\\FrameWork\\External file\\Exc.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook b = new XSSFWorkbook(fin);

		Sheet sh = b.getSheet("Register");

		Row r = sh.createRow(3);

		Cell c1 = r.createCell(0);
		Cell c2 = r.createCell(1);
		Cell c3 = r.createCell(2);

		c1.setCellValue("Akkask");
		c2.setCellValue("Smart");
		c3.setCellValue("09-0-1996");

		FileOutputStream fout = new FileOutputStream(f);
		b.write(fout);

		System.out.println("Finish");

	}

}
