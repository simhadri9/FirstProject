package advanced_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checking_empregistration_in_ohrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("smd");
		driver.findElement(By.id("lastName")).sendKeys("p");
		
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				System.out.println("employee registration success ,test pass");
			}else
			{
				System.out.println("employee registration not success , test fail");
			}
		}

	}

}
