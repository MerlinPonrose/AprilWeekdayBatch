package com.datadriven.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.datadriver.test.TestExecutor;

public class LoginPage extends TestExecutor{
	
	public static By emailID = By.id("input-email");
	public static By password = By.id("input-password");
	public static By loginButton = By.xpath("//input[@value='Login']");
	
	
	public void login() throws IOException
	{
		com.enterValue(emailID, getData("Username"),"Email");
		com.enterValue(password, getData("Password"),"Password");
		com.ClickElement(loginButton,"Login Button");
	}

}
