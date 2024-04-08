package data_types;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightsapp_login {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("http://flights.qedgetech.com");
	driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//input[@name='price_class' and @value='Business']")).click();

	}

}
