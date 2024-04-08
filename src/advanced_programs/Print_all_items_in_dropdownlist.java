package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_items_in_dropdownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://Amazon.com");
		Select dlist = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement> items =  dlist.getOptions();
		
		System.out.println(items.size());
		for(WebElement element:items)
		{
			String elist= element.getText();
			System.out.println(elist);
		}

	}

}
