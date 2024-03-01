package seleniumActivities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		//my way of code
		System.out.println(driver.findElements(By.cssSelector(".left-align th")).size());
		System.out.println(driver.findElements(By.cssSelector(".left-align tr")).size());
		System.out.println(driver.findElement(By.cssSelector(".left-align tr:nth-child(3)")).getText());
		
		//rahulshettycode
		WebElement table=driver.findElement(By.cssSelector("#product"));
		int noOfrows=table.findElements(By.tagName("tr")).size();
		System.out.println("Total number of rows are available on Table: "+noOfrows);
		int noOfcolumns=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println("Total number of columns are available on Table: "+noOfcolumns);
		System.out.println("Second row data  ");
		List<WebElement>secondRowdata=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for(int i=0;i<secondRowdata.size();i++)
		{
			System.out.println(secondRowdata.get(i).getText());
			
		}
		
		

	}

}
