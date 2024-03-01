package seleniumActivities;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignement4WindoHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\\\RahulShetty\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		String childWindowtext=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println("ChildchildWindowtext: "+childWindowtext);
        driver.switchTo().window(parentWindow);
		String parentWindowtext=driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        System.out.println("ParentWindowtext: "+parentWindowtext);
	}

}
