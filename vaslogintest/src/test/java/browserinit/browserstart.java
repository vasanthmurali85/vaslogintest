package browserinit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserstart {
	
	public static WebDriver driver1;

	@BeforeClass
	public void bf1()
	{
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void af1()
	{
		driver1.close();
		driver1.quit();
	}
	
}
