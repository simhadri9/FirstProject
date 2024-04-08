package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class count_no_of_cols_in_table {

	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.railyatri.in/time-table");
			WebElement trains = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table"));
			
			List<WebElement> rows = trains.findElements(By.tagName("tr"));
			List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
			System.out.println(cols.size());

	}

}
