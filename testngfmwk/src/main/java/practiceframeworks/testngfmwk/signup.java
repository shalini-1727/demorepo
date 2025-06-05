package practiceframeworks.testngfmwk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.name("name")).sendKeys("shalini");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("ncshalini91@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		
		//signupdetails
		
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shalini");
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select day1 = new Select(day);
		day1.selectByValue("17");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("March");
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='years']"));
		Select Year1 = new Select(Year);
		Year1.selectByValue("1991");
		
		//driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("shalini");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("alagar");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("balarengapuram");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("privateroad");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select country1 = new Select(country);
		country1.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Tamilnadu")
;
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Madurai");
		
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("625009");
		
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9876543210");
		
		WebElement create = driver.findElement(By.cssSelector("button[data-qa='create-account']"));
		create.click();
	}

}
