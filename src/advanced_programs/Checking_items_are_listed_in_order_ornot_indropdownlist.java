package advanced_programs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checking_items_are_listed_in_order_ornot_indropdownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://Amazon.com");
		Select dlist = new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement> catlist= dlist.getOptions();
        
        String cat1,cat2;
        boolean order=true;
        for(int i=1; i<catlist.size();i++)
        {
        	cat1=catlist.get(i-1).getText();
        	cat2=catlist.get(i).getText();
        	
        	if(cat2.compareToIgnoreCase(cat1)<0)
        	{
        		order=false;
        		break;
        	}
        }
        if(order)
        {
        	System.out.println("test pass");
        }else
        {
        	System.out.println("test fail");
        }

	}

}
