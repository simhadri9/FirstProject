package advanced_programs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("ravanji");
		driver.findElement(By.name("lastname")).sendKeys("lanka");
		
		Select daylist = new Select(driver.findElement(By.id("day")));
		daylist.selectByVisibleText("11");
		
		Select monthlist = new Select(driver.findElement(By.id("month")));
		monthlist.selectByIndex(6);
		
		Select yearlist = new Select(driver.findElement(By.id("year")));
		yearlist.selectByVisibleText("2003");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

}
