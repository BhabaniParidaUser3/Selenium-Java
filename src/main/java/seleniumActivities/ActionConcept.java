package seleniumActivities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\RahulShetty\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement signInSectionMove=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement serachbarMove=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		WebElement rightClickOnElement=driver.findElement(By.cssSelector("#nav-orders"));
		
		//move to Specific element=signInSectionMove
		a.moveToElement(signInSectionMove).build().perform();
		
		//move to specific element=serachbarMove
		//a.moveToElement(serachbarMove).click().keyDown(Keys.SHIFT).sendKeys("oneplus").build().perform();
		a.moveToElement(serachbarMove).click().keyDown(Keys.SHIFT).sendKeys("oneplus").doubleClick().build().perform();
		
		//do Rightclick on Return&orderelement
		a.moveToElement(rightClickOnElement).contextClick().build().perform();


	}

}
