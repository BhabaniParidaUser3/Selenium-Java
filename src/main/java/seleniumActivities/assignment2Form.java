package seleniumActivities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name' and @type='text' and @class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("Bhabani");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Bhabani.sk.Parida@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhabani@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
		s1.selectByIndex(0);
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12/22/1995");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		

	}

}
