package practiceframeworks.testngfmwk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovidersepclass1 {
	@Test(dataProvider="getdata",dataProviderClass = dataprovidersepclass.class)
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
