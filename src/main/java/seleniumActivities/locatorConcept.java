package seleniumActivities;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("user_name")).sendKeys("Bhabani");
		driver.findElement(By.id("user_email")).sendKeys("abcde@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='toast-wrapper']//div//span")).getText());
		//driver.close();

	}

}
