package seleniumActivities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class JavascriptExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait w=new WebDriverWait(driver,5);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//lines of code written for scrolling window scroll bar
		jse.executeScript("window.scrollBy(0,500)");
		//lines of code written for any component scroll bar
		//jse.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		List<WebElement>el1=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for (WebElement el:el1)
		{
			System.out.println(el.getText());
		}
		int sum=0;
		 for (int i=0;i<el1.size();i++)
		 {
			 
			 sum=sum+Integer.parseInt(el1.get(i).getText());
		 }
		 System.out.println("Sum of Amount coulmn : "+sum);
		 
		 int str=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		 
		 System.out.println("total amount collected mentioned  in webpage :"+str);
		 
		 Assert.assertEquals(sum, str);
		
		
	}

}
