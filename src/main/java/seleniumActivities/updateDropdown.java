package seleniumActivities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateDropdown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.manage().window().maximize();
driver.findElement(By.id("divpaxinfo")).click();


/*int i=1;
while(i<4)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
}
*/


System.out.println("Total Number of passenger Selected: "+driver.findElement(By.id("divpaxinfo")).getText());

for(int i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
driver.findElement(By.id("btnclosepaxoption")).click();
System.out.println("Total Number of passenger Selected: "+driver.findElement(By.id("divpaxinfo")).getText());

driver.close();
	}
	

}
