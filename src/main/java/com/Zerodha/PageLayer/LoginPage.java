package com.Zerodha.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zerodha.BaseClass.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//input[@id='userid']")
	private WebElement uID;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName() {
		uID.sendKeys("DAA677");
	}
	
	public void setPassword() {
		passWord.sendKeys("Velocity@123");
	}
	
	public void verifyLoginButton() {
		loginButton.click();
	}
	
}
