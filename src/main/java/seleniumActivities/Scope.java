package seleniumActivities;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1.give number of links present on page
		System.out.println("No of Links present on page: "+driver.findElements(By.tagName("a")).size());
		//limiting of WebDriverdriver scope
		//2.write code for how many links present on footers section
		WebElement footerdriver=driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		System.out.println("No of Links present on FooterPage: "+footerdriver.findElements(By.tagName("a")).size());
		//3.write code for how many link is present under footer 1st column
		WebElement footercolumn1=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int footerColumn1tagsize=footercolumn1.findElements(By.tagName("a")).size();
		System.out.println("No of Links present on FooterColumn1: "+footerColumn1tagsize);
		
		if(footerColumn1tagsize !=0)
		{
			System.out.println("No of Links present on FooterColumn1:"+footerColumn1tagsize);
			
			
			for(int i=0;i<footerColumn1tagsize;i++)
			{
				String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				footercolumn1.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);		
			}
			Set<String>abc=driver.getWindowHandles();
			Iterator<String>it=abc.iterator();
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		}
		else
		{
			System.out.println("No tag is present");
		}
		driver.close();
	}

}
