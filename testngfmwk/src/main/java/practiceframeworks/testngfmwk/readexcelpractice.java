package practiceframeworks.testngfmwk;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelpractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filelocation="./test data/login.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastrownum = sheet.getLastRowNum();
		int physicalnumberofrows = sheet.getPhysicalNumberOfRows();
		System.out.println("Inclusive Header"+physicalnumberofrows);
		System.out.println("Except header"+lastrownum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("no of columns"+lastCellNum);
		
		for(int i=1;i<=lastrownum;i++) {
				
		XSSFRow row = sheet.getRow(i);
		for(int j=0;j<lastCellNum;j++)
		{
			DataFormatter dft =  new DataFormatter();
			XSSFCell cell = row.getCell(j);
			String value=dft.formatCellValue(cell);
			System.out.println(value);
			
			
		}
		
		
		
		
		}
		wbook.close();

	}

}
