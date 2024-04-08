package advanced_programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capture_allwindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		Object[] windows = allids.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		driver.switchTo().window(window2).findElement(By.linkText("Community")).click();
		driver.switchTo().window(window1).findElement(By.id("identifierId")).sendKeys("Demo");
		
		
		

	}

}
