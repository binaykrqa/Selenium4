package sel4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetScreenShot {

	@Test
	public void screenshotTest() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		File SrcFile = logo.getScreenshotAs(OutputType.FILE);
		//String filePath = "C:\\Users\\Binay\\eclipse-workspace\\AutomationProject\\src\\main\\resources\\com\\test\\";
		//String filePath = "D:\\test\\";
		//File newFile = new File(filePath +"/logo.png");
		File newFile = new File("logo.png");
		FileUtils.copyFile(SrcFile, newFile);
		Thread.sleep(3000);
		driver.quit();
	}
}
