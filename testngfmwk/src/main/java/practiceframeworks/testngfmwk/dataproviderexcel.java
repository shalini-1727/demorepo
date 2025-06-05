package practiceframeworks.testngfmwk;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class dataproviderexcel {
	
	@DataProvider()
	
	public String[][] getData()
	{
		String[][] exceldata = null;
		
		try {
			exceldata=ReadExceltoDataProvider.ReadExcelData();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return exceldata;
	}

}
