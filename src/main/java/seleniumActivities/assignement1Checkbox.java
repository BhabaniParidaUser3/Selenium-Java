package seleniumActivities;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignement1Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("Count of number of check boxes present in the page: "+driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println("1st Checkbox is selected");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println("1st Checkbox is Deselected");
		
		driver.close();
	
	}
		
		

}

