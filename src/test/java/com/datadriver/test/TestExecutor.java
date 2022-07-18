package com.datadriver.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.datadriven.pages.HomePage;
import com.datadriven.pages.IPhone_ProductPage;
import com.datadriven.pages.LoginPage;
import com.datadriven.pages.WishListPage;
import com.datadriven.utility.Common;
import com.datadriven.utility.ExcelRead;

public class TestExecutor {
	
	public static WebDriver driver;
	
	public static Common com = new Common();
	public static HomePage hmpg = new HomePage();
	public static IPhone_ProductPage iPhonePg = new IPhone_ProductPage();
	public static LoginPage loginPg = new LoginPage();
	public static WishListPage wishlistPg = new WishListPage();
	public static ExcelRead excel = new ExcelRead();
	
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	
	public static HashMap<String,String> map = new HashMap<String, String>();
	public static DataFormatter formatter = new DataFormatter();
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extentreport;
	public static ExtentTest test;
	
	
	@BeforeTest
	public void createReport()
	{
		htmlreporter = new ExtentHtmlReporter("extentReport.html");
		extentreport = new ExtentReports();
		extentreport.attachReporter(htmlreporter);
	}
	
	@BeforeMethod
	public void launchbrowser() throws IOException
	{

		File f = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\AprilDataDrivenn\\src\\test\\java\\com\\datadriven\\config\\environment.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");
		
		
		String browser = prop.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Documents\\newExe\\chromedriver.exe");	
			driver= new ChromeDriver();
			driver.manage().window().maximize(); // maximizing the browser
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\April2Selenium\\exe\\geckodriver.exe");	
			driver= new FirefoxDriver();
			driver.manage().window().maximize(); // maximizing the browser
		}
	
		driver.get(url);
	}
	
	
	public String getData(String key) throws IOException
	{
		return excel.getMapData(key);
	}
	
	
	@AfterMethod
	public void endReport()
	{
		extentreport.flush();
	}

}
