package advanced_programs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checking_imagelink_workingor_not {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String exptitle , acttitle;
		exptitle = "Google Images";
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();
		acttitle = driver.getTitle();
		if(acttitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("tess pass");
		}else
		{
			System.out.println("test fail");
		}



	}

}
