package com.datadriven.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.datadriver.test.TestExecutor;



public class Common extends TestExecutor{

	
	
	public void ClickElement(By loc,String element) throws IOException
	{
	try
	{
		driver.findElement(loc).click();
		test.log(Status.PASS, element+ "clicked successfully");
	}
	catch(Exception e)
	{
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Karen Amy\\eclipse-workspace\\April2Selenium\\src\\test\\java\\screenshot\\image.png"));
		
		test.log(Status.FAIL,element+ "not clicked"+ test.addScreenCaptureFromPath("C:\\\\Users\\\\Karen Amy\\\\eclipse-workspace\\\\April2Selenium\\\\src\\\\test\\\\java\\\\screenshot\\\\image.png"));

	}
	
	}
	
	public void clickElementByxpath(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public void enterValue(By loc,String value,String element)
	{
		try
		{
			WebElement ele =	driver.findElement(loc);
			ele.click();
			ele.clear();
			ele.sendKeys(value);
			test.log(Status.PASS,"Value enetered in "+element);
		}
		catch(Exception e)
		{
			test.log(Status.FAIL,"Value not enetered in "+element);
		}
	}
	
	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");

	}
	
	
	public void isSelected(By loc)
	{
		WebElement ele = driver.findElement(loc);
		if(ele.isSelected())
			
		{
			System.out.println("Radio button selected");
		}
		
		else
		{
			System.out.println("Radio button is not selected");
		}
		
	}
	
	
	public void validatePageTitle(String expectedTitle)
	{
	String currentTitle=	driver.getTitle();
	
	if(currentTitle.contains(expectedTitle))
	{
		System.out.println("Page is navigated to "+expectedTitle +" page");
	}
	else
	{
		System.out.println("Page is not navigated to "+expectedTitle +" page");
	}
	}
	
}
