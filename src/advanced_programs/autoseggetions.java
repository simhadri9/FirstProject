package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoseggetions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> sample = driver.findElement(By.className("aajZCb")).findElements(By.tagName("li"));
		System.out.println(sample.size());
		for(WebElement element:sample)
		{
			String s= element.getText();
			System.out.println(s);
		}
		

	}

}
