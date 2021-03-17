package sel4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tab_WindowsHandling {
	WebDriver driver;

	@Test
	public void NewTAB() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		
		
//		WebDriver newTab= driver.switchTo().newWindow(WindowType.TAB);
		WebDriver newTab= driver.switchTo().newWindow(WindowType.WINDOW);
		String child=newTab.getWindowHandle();
		System.out.println(child);
		newTab.get("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='link']/div/ul/li[10]/a")).click();
		driver.close();
		newTab.switchTo().window(parent);
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
		
		
		
	}
}
