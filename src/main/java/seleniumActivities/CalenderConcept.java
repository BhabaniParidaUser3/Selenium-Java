package seleniumActivities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		WebElement we1=driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", we1);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='form-field-travel_comp_date']")));
		we1.click();
		Actions a=new Actions(driver);
		
		//Grab the common attribute//put into list & iterrate
		while(!w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'cur-month')]"))).getText().contains("March"))
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'flatpickr-next-month')]"))).click();
		}
		
		while(!w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'numInput cur-year')]"))).getText().contains("2026"))
		{
			System.out.println(driver.findElement(By.xpath(" ")).getText());
			a.moveToElement(driver.findElement(By.xpath("//span[contains(@class,'arrowUp')]"))).click().build().perform();
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'arrowUp')]"))).click();
		}
		
		
		/*while(!driver.findElement(By.xpath("//span[contains(@class,'cur-month')]")).getText().contains("November"))
		{
			driver.findElement(By.xpath("//span[contains(@class,'flatpickr-next-month')]")).click();
		}
		
		while(!driver.findElement(By.xpath("//input[contains(@class,'numInput cur-year')]")).getText().contains("2026"))
		{
			driver.findElement(By.xpath("//span[contains(@class,'arrowUp')]")).click();
		}*/
		
		int count=driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day ') and not(contains(@class, 'disabled'))]")).size();
		for (int i=0;i<count;i++)
		{
			String dayText=driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day ') and not(contains(@class, 'disabled'))]")).get(i).getText();
			if(dayText.equalsIgnoreCase("12"))
			{
				driver.findElements(By.xpath("//span[contains(@class,'flatpickr-day ') and not(contains(@class, 'disabled'))]")).get(i).click();
				break;
			}
		}
		
		
		//driver.close();

	}

}
