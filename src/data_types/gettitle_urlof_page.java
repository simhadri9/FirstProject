package data_types;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle_urlof_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		String pgtitle= driver.getTitle();
		System.out.println(pgtitle);
		
		String pgurl = driver.getCurrentUrl();
		System.out.println(pgurl);

	}

}

