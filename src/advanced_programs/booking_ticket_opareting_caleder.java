package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking_ticket_opareting_caleder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String flydate = "9/November/2027";
		
		String[] temp = flydate.split("/");
		
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		driver.findElement(By.id("search-date")).click();
		
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.linkText("Next")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(WebElement element:cols)
			{
				if(element.getText().equals(date))
				{
				element.click();
				break;
				}
			}
		}
		
		

	}

}
