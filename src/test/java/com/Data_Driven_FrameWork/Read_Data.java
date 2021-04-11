package com.Data_Driven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void Particular_Data() throws IOException {

		File f = new File("C:\\Users\\dhivakar4590\\eclipse-workspace\\Data_Driven_FrameWork\\read_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(0);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int value = (int) numericCellValue;

			System.out.println(value);
		}
	}

	public static void All_Data() throws IOException {

		File f = new File("C:\\Users\\dhivakar4590\\eclipse-workspace\\Data_Driven_FrameWork\\read_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int Row_Size = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < Row_Size; i++) {

			Row row = sheetAt.getRow(i);
			int cell_size = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cell_size; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}

				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue;
					System.out.println(value);

				}
			}

		}

	}

	public static void Particular_Dat() throws IOException {
		File f = new File("C:\\Users\\dhivakar4590\\eclipse-workspace\\Data_Driven_FrameWork\\read_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int Row_Size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 1; i <= 1; i++) {

			Row row = sheetAt.getRow(i);
			int cell_size = row.getPhysicalNumberOfCells();
			for (int j = 0; j <= 1; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}

				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue;
					System.out.println(value);

				}

			}
		}

	}

	public static void Particular_Cel() throws IOException {
		File f = new File("C:\\Users\\dhivakar4590\\eclipse-workspace\\Data_Driven_FrameWork\\read_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int Row_Size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i <= Row_Size; i++) {

			Row row = sheetAt.getRow(i);
			int cell_size = row.getPhysicalNumberOfCells();
			for (int j = 1; j <= 1; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}

				else if (cellType.equals(cellType.NUMERIC)) { 
					double numericCellValue = cell.getNumericCellValue();

					int value = (int) numericCellValue;
					System.out.println(value);

				}

			}
		}

	}

	public static void main(String[] args) throws IOException {
		Particular_Data();

		System.out.println("*****All Data*****");

		All_Data();

		System.out.println("****row****");
		Particular_Dat();

		System.out.println("****column****");
		Particular_Cel();

	}
}
