package com.datadriven.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.datadriver.test.TestExecutor;

public class WishListPage extends TestExecutor{
	
public static By addToCart = By.xpath("//button[@data-original-title='Add to Cart']");

public void clickAddToCart() throws IOException
{
	com.ClickElement(addToCart,"Add To Cart");
}

}
