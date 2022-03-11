package com.app.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.Basepage;
import com.app.pages.HomePageObject;

public class ProductPageTest {


	HomePageObject HomePage;
	Basepage Bpage;

	public ProductPageTest() {
		HomePage = new HomePageObject();
		Bpage = new Basepage();
	}
	
	@Test 
	public void verifyShareTweet(){
		HomePage.getlinkedTextTshirts().click();
		HomePage.mouseHoverOnElement(HomePage.getProductElementOnTshirtPage());
		HomePage.getBtnMoreOptionOnProduct().click();
		Assert.assertTrue(HomePage.getBtnTweet().isDisplayed());
		Assert.assertTrue(HomePage.getBtnTweet().isDisplayed());
		
	}
	@Test 
	public void verifyProductDscriptionIsDisplayed(){
		HomePage.getlinkedTextTshirts().click();
		HomePage.mouseHoverOnElement(HomePage.getProductElementOnTshirtPage());
		HomePage.getBtnMoreOptionOnProduct().click();
		Assert.assertTrue(HomePage.getDescriptionOfElementOnTshirtPage().isDisplayed());
	}
	@Test (enabled = false)
	public void verifyCount(){
		HomePage.getlinkedTextDresses().click();
		System.out.println(HomePage.ProductsCountFromHeader());
		System.out.println(HomePage.TotalProductsCount());
		
		//Assert.assertTrue(HomePage.verifyCountMatch());	
	}
	@Test 
	public void addAndVerifyCart(){
		HomePage.getlinkedTextTshirts().click();
		HomePage.mouseHoverOnElement(HomePage.getProductElementOnTshirtPage());
		HomePage.getAddProductToCart().click(); 
		Assert.assertTrue(HomePage.TxtsuccessfullyaddedProductinCart());
		//HomePage.getBtnCart().click();
		
	}
	
	
}
