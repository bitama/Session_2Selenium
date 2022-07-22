package varousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LounchApp {
	WebDriver driver;

	@Before
	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void login() {
		WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*[@id='username']"));
		WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//*[@id='password']"));
		WebElement LOGIN_ELEMENT=driver.findElement(By.xpath("//*[@name='login']"));
		
        
		By USERNAME_LOCATOR = By.xpath("//*[@id='username']");
		By PASSWORD_LOCATOR = By.xpath("//*[@id='password']");
		By LOGIN_LOCATOR = By.xpath("//*[@name='login']");
		By DASHBOARD_LOCATOR = By.xpath("//span[normalize-space()='Dashboard']");
		
		
		USERNAME_ELEMENT.clear();
		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		LOGIN_ELEMENT.click();
		
		
		boolean pageTitleDisplay;
         try {
         WebElement DASHBOARD_ELEMENT=driver.findElement(By.xpath("//span[normalize-space()='Dashboard']"));
         pageTitleDisplay=true;
			
		} catch (Exception e) {
			pageTitleDisplay = false;
			e.printStackTrace();
		}
         
         
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARD_LOCATOR));
		
		Assert.assertTrue("Sorry you are at wrong Page",pageTitleDisplay);
		
		

        
		
		
		
		
		
		

		
		

	}

	@After
	public void tearDown() {
//		driver.close();
//		driver.quit();
	}
}
