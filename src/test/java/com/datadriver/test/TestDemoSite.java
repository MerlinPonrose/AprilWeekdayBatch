package com.datadriver.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestDemoSite extends TestExecutor{
	
	
	@Test
	public void testsite() throws InterruptedException, IOException
	{
		
		test = extentreport.createTest("Place Order");
		
		hmpg.clickLogin();
		loginPg.login();
		hmpg.searchProduct();
		iPhonePg.validateProductPage();
		iPhonePg.clickWishListIcon();
		hmpg.clickWishListMenu();
		com.validatePageTitle("Wish list");
		wishlistPg.clickAddToCart();
	}
	
	
	

}
