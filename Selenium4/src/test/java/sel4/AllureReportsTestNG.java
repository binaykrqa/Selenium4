package sel4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//Some command   java -version mvn --version allure --version
//allure serve D:\Eclipse\Selenium4\allure-results

public class AllureReportsTestNG {
	WebDriver driver;

	@Test
	public void NewTAB() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.javatpoint.com/");
		driver.quit();
	}
	
	@Test
	public void New() throws IOException, InterruptedException {
		driver.get("https://www.javatpoint.com/");
		driver.quit();
	}
	

//	@Test
//	public void windowNewTest() throws IOException, InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//		WebDriver parentWin=driver.switchTo().newWindow(WindowType.WINDOW);
//		System.out.println(parentWin);
//			
//		driver.get("https://www.javatpoint.com/");
//		
//	}
//	
//	@Test
//	public void verifyTitle() {
//		Assert.assertEquals(driver.getTitle(),"Google");
//	}
	
}
