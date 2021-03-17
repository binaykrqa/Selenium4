package sel4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDimention {

	@Test
	public void screenshotTest() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		Thread.sleep(3000);
		// get Dimension
		System.out.println("Height=" + logo.getRect().getDimension().getHeight());
		System.out.println("Width=" + logo.getRect().getDimension().getWidth());
		// get Coordinate
		System.out.println("X Location=" + logo.getRect().getX());
		System.out.println("Y Location=" + logo.getRect().getY());
		driver.quit();
	}
}
