package InterviewCodeQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question01 {

	//Go to https://www.amazon.in/ and print all webelement present under Account&List(top right of the page)
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement eleALele = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(eleALele).perform();
		List<WebElement>al=driver.findElements(By.xpath("//*[starts-with(@id,'nav-al-container')]//a"));
		for(WebElement ele:al)
		{
			System.out.println(ele.getText());
			
		}
		

	}

}
