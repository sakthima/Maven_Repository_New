package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Write {

	public static void writeData() throws IOException {

		File f = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\TestData\\TestData_Write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
//		wb.createSheet("data1").createRow(0).createCell(0).setCellValue("email");
//		Row row = wb.getSheetAt(1).getRow(0);
//		row.removeCell(row.getCell(0));
//		wb.getSheetAt(1).createRow(0).createCell(0).setCellValue("email");
//		wb.getSheetAt(1).getRow(0).createCell(1).setCellValue("password");
//		wb.getSheetAt(1).createRow(1).createCell(0).setCellValue("sakthi123@gmail.com");
		wb.getSheetAt(1).getRow(1).createCell(1).setCellValue("1234");
		
		
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	
	public static void main(String[] args) throws IOException {
		writeData();
	}

}
