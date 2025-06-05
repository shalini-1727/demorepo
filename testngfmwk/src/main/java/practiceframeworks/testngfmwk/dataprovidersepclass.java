package practiceframeworks.testngfmwk;

import org.testng.annotations.DataProvider;

public class dataprovidersepclass {
@DataProvider(parallel=!true)
	
	public String[][] getdata()
	{
		
		String[][] data= new String[2][2];
		data[0][0]="ncshalini91@gmail.com";
		data[0][1]="shalini";
		
		
		data[1][0]="nashalini91@gmail.com";
		data[1][1]="Sshalini";
		
		return data;
	}
}
