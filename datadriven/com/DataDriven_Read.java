package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {

	public static void readData() throws IOException {

		File f = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numericvalue = (int) numericCellValue;
			System.out.println(numericvalue);
		} else {
			System.out.println("Invalid CellType");
		}
	}

	public static void readAllData() throws IOException {
		
		File f = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\First_Maven\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
		
		int cellsize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellsize; j++) {
			Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int numericvalue = (int) numericCellValue;
                    System.out.println(numericvalue);
				}else {
					System.out.println("Invalid Cell Type");
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
	//	readData();
		readAllData();
	}

}
