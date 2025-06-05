package practiceframeworks.testngfmwk;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class logindpexcel {
	
	@Test(dataProvider="getData",dataProviderClass=dataproviderexcel.class)
	
	public void signin(String data[][])
	{
		System.out.println(data[0]);
		System.out.println(data[1]);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
