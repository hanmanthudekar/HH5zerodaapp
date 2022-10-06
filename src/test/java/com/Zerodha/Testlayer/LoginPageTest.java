  package com.Zerodha.Testlayer;


import org.testng.annotations.Test;

import com.Zerodha.BaseClass.BaseClass;

public class LoginPageTest extends BaseClass{

	@Test
	public void verifyLogin() {
		login.setUserName();
		login.setPassword();
		login.verifyLoginButton();
		
		pp.setPin();
		pp.verifyContinueButton();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
