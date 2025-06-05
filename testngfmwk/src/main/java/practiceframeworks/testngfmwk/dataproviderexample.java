package practiceframeworks.testngfmwk;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderexample {
	@DataProvider(name="login",parallel=true)
	
	public String[][] getdata()
	{
		
		String[][] data= new String[2][2];
		data[0][0]="ncshalini91@gmail.com";
		data[0][1]="shalini";
		
		
		data[1][0]="nashalini91@gmail.com";
		data[1][1]="Sshalini";
		
		return data;
	}
	
	@Test(dataProvider="login",description="this is used to signin application")
	public void signin(String email,String pass)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
