package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_DOB_by_operating_calender_in_flightsapp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		
		String dob = "11-Jun-2003";
		
		String[] temp = dob.split("-");
		
		String dt = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		driver.findElement(By.name("dob")).click();
		
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		ylist.selectByVisibleText(year);
		
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		mlist.selectByVisibleText(month);
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element:cols)
			{
				if(element.getText().equals(dt))
				{
					element.click();
					break;
				}
			}
		}
		

	}

}
