package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking_flight_ticket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		
		driver.findElement(By.name("email")).sendKeys("cmhadrismd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("cmhasmd@786.");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("search-date")).sendKeys("07/15/2025");
		
		Select from = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/select")));
		from.selectByVisibleText("Hyderabad");
		
		Select fly = new Select(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[3]/select")));
		fly.selectByVisibleText("Kolkatha");
		
		driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div[2]/div[1]/div/div/div[4]/button")).click();
		driver.findElement(By.className("flights_table"));
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		rows.get(4).findElement(By.xpath("//button[@data-airline='Soft Airlines']")).click();
		
		driver.findElement(By.id("name")).sendKeys("smd");

		driver.findElement(By.id("tickets")).clear();
		driver.findElement(By.id("tickets")).sendKeys("3");
		
		driver.findElement(By.xpath("/section[2]/div/div[2]/div/div[2]/div[1]/div/div/form/div/div[4]/div/button")).click();
		
	}

}
