package sel4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class RelativesXpath {
	
	@Test
	public void screenshotTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebElement logo=driver.findElement(By.xpath("//img[@id='pid1_thumb']"));
		//WebElement logo=driver.findElement(RelativeLocator.withTagName("li").toRightOf(By.xpath("//img[@id='pid1_thumb']")).below(By.id("pid1_thumb")));
		WebElement logo=driver.findElement(withTagName("li").toRightOf(By.xpath("//img[@id='pid1_thumb']")).below(By.id("pid1_thumb")));
		System.out.println(logo.getText());
		driver.quit();
	}
}
