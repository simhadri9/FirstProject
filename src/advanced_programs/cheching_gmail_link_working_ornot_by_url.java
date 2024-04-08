package advanced_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cheching_gmail_link_working_ornot_by_url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String expurl , acturl;
		expurl = "gmail";
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		acturl = driver.getCurrentUrl();
		
		if(acturl.toLowerCase().contains(expurl))
		{
			System.out.println("test pass");
		}else
		{
			System.out.println("test fail");
		}
		
		
	

	}

}
