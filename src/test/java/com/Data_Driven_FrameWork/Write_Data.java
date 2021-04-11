package com.Data_Driven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void write() throws IOException {
		File f = new File("C:\\Users\\dhivakar4590\\Desktop\\Write_Data.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("User_Details");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("UserName");

		wb.getSheet("User_Details").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("User_Details").createRow(1).createCell(0).setCellValue("divya");
		wb.getSheet("User_Details").getRow(1).createCell(1).setCellValue("123");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Data_Created");

	}

	public static void main(String[] args) throws IOException {
		write();
		
	}
}
