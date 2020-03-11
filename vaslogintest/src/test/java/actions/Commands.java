package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserinit.browserstart;

public class Commands {
	
	WebDriver driver;
	
	public Commands()
	{
		driver = browserstart.driver1;
	}
	
	public void navigate(String url)
	{
		driver.get(url);
	}
	public void click(By locator)
	{
		driver.findElement(locator).click();
	}
	public void enterkets(By locator, String txt)
	{
		driver.findElement(locator).sendKeys(txt);
	}
	
	public boolean isenabledcheck(By locator)
	{
		boolean k1 = driver.findElement(locator).isEnabled();
		return k1;
	}
	
	public String gettext(By locator)
	{
	String s1 = driver.findElement(locator).getText();
	return s1;
	
	}

}
