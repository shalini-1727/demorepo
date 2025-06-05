package practiceframeworks.testngfmwk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ncshalini91@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("shalini");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
