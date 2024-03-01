package javaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//clickon the sorted icon/1st column
driver.findElement(By.cssSelector(".sort-icon.sort-descending")).click();

//captur all webelement into list-1stcolumn of table
List<WebElement> allelements=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));

//capture text of all element
List<String>originallist=allelements.stream().map(s->s.getText()).collect(Collectors.toList());


//sorted the original list
List<String>sortedlist=originallist.stream().sorted().collect(Collectors.toList());

//compared the originallist with sortedlist to check both are same or not
if(originallist.equals(sortedlist))
{
	System.out.println("matched");
}

	}
}
