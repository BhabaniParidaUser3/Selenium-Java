package seleniumActivities;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestionDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");	
		List<WebElement>options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for(WebElement option:options)
        {
        	if(option.getText().equalsIgnoreCase("INDIA"))
{
        		option.click();
        		break;
	
}
        }
	}

}
