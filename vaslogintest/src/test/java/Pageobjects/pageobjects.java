package Pageobjects;

import org.openqa.selenium.By;

public class pageobjects {
	
	public static By username = By.name("username");
	public static By password = By.name("password");
	public static By loginclick = By.id("tdb1");
	public static By manufacturelink = By.linkText("Manufacturers");
	public static By noofmanu = By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[22]/td/table/tbody/tr/td[1]/strong[3]");
	public static By adminlink = By.linkText("Administration");
	public static By logoffbutton = By.linkText("Logoff");
	public static By manufacname = By.name("manufacturers_name");
}


