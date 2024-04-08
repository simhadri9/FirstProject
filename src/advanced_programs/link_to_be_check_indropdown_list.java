package advanced_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class link_to_be_check_indropdown_list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://amazon.com");
		String item = "Computers";
		
		Select optlist = new Select(driver.findElement(By.id("searchDropdownBox")));
		try {
			optlist.selectByVisibleText(item);
			System.out.println("test pass");
		} catch (Exception e) {
			System.out.println("test fail");
		}

	}

}
