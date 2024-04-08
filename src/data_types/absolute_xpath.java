package data_types;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.navigate().to("http://orangehrm.qedgetech.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[3]/input")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		

	}

}
