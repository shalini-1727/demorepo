package practiceframeworks.testngfmwk;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadExceltoDataProvider {
	public static String[][] ReadExcelData() throws IOException
	{
	String filelocation="./test data/login.xlsx";
	XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
	XSSFSheet sheet = wbook.getSheetAt(0);
	int lastrownum=sheet.getLastRowNum();
	int physicalnoofrows = sheet.getPhysicalNumberOfRows();
	System.out.println("with header"+physicalnoofrows);
	System.out.println("without header"+lastrownum);
	short lastCellNum= sheet.getRow(0).getLastCellNum();
	System.out.println("no of columns"+lastCellNum);
	String[][] data = new String[lastrownum][lastCellNum];
	for(int i=1;i<lastrownum;i++)
	{
		XSSFRow	row=sheet.getRow(i);
		for(int j=0;j<lastCellNum;j++)
		{
			XSSFCell cell= row.getCell(j);
			DataFormatter dft = new DataFormatter();
			String stringcellvalue = dft.formatCellValue(cell);
			data[i-1][j] =stringcellvalue;
			
			
			
		}
		
	}
	wbook.close();
	return data;
	
	
	
	
	}
	}
