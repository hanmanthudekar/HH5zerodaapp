package com.Zerodha.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Zerodha.BaseClass.BaseClass;

public class PinPage extends BaseClass {

	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	public PinPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void setPin() {
		pin.sendKeys("866918");
	}
	
	public void verifyContinueButton() {
		continueButton.click();
	}
}
