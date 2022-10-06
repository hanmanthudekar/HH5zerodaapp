package com.Zerodha.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Zerodha.PageLayer.LoginPage;
import com.Zerodha.PageLayer.PinPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage login;
	public static PinPage pp;
	
	@BeforeSuite
	public void initBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login = new LoginPage();
		pp = new PinPage();
	}
	
	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
	}
}
