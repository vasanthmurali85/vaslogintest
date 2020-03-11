package mavenprac.vaslogintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pageobjects.pageobjects;
import actions.Commands;
import browserinit.browserstart;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class usertest extends browserstart{
	
	
	@Test (priority = 10, groups = "sanity")
	public void t1()
	{
		Commands com1 = new Commands();
		com1.navigate("http://gcrit.com/build3/admin/");
		com1.enterkets(pageobjects.username, "admin");
		com1.enterkets(pageobjects.password, "admin@123");
		com1.click(pageobjects.loginclick);	
		boolean a1 = com1.isenabledcheck(pageobjects.manufacturelink);
		Assert.assertEquals(true, a1);		
	}
	
	
	@Test (priority = 20, groups ="Sanity", dependsOnMethods = "t1")
	public void t2()
	{
		Commands com2 = new Commands();
		com2.click(pageobjects.manufacturelink);		
		String a1 = driver1.findElement(pageobjects.noofmanu).getText();
		int no1 = Integer.parseInt(a1);		
		driver1.findElement(pageobjects.loginclick).click();
		driver1.findElement(pageobjects.manufacname).sendKeys("newmanufac1");
		driver1.findElement(pageobjects.loginclick).click();		
		String a2 = com2.gettext(pageobjects.noofmanu);
		int no2 = Integer.parseInt(a2);
		Assert.assertEquals(no1+1, no2);
	}
	
	
	@Test (priority = 30, groups = "Sanity", dependsOnMethods = "t2")
	public void t3()
	{
		Commands com3 = new Commands();		
		boolean en1 = com3.isenabledcheck(pageobjects.adminlink);		
		Assert.assertEquals(true, en1);
		com3.click(pageobjects.adminlink);		
		boolean en2 = com3.isenabledcheck(pageobjects.logoffbutton);
		Assert.assertEquals(true, en2);
	}

}
