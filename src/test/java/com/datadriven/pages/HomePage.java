package com.datadriven.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.datadriver.test.TestExecutor;

public class HomePage extends TestExecutor{
	
	public static By searchboxx = By.name("search");
	public static By searchicon = By.xpath("//button[@class='btn-lg']");
	public static By MyAccountLink = By.xpath("//a[@title='My Account']");
	public static By LoginLink = By.xpath("//a[text()='Login']");
	public static By WishListLink = By.xpath("//a[contains(@title,'Wish List')]");
	
	
public void searchProduct() throws IOException
{
	com.ClickElement(searchboxx,"Search Box");
	com.enterValue(searchboxx, getData("Product"),"Search Box");
	com.ClickElement(searchicon,"Search Icon");
}

public void clickMyAccount() throws IOException
{
	com.ClickElement(MyAccountLink,"My Account Link");
}

public void clickLogin() throws IOException
{
	clickMyAccount();
	com.ClickElement(LoginLink,"Login Link");
}

public void clickWishListMenu() throws InterruptedException, IOException
{
	Thread.sleep(5000);
	com.ClickElement(WishListLink,"WishList Link");
}
	

}
