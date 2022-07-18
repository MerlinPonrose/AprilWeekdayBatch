package com.datadriven.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.datadriver.test.TestExecutor;

public class IPhone_ProductPage extends TestExecutor{
	
	
	public static By wishlistIcon = By.xpath("//button[@data-original-title='Add to Wish List']");
	
	
	public void validateProductPage()
	{
		com.validatePageTitle("iPhone");
	}
	
	
	public void clickWishListIcon() throws IOException
	{
		com.ClickElement(wishlistIcon,"WishList Icon");
	}

}
