package com.app.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.Basepage;
import com.app.pages.HomePageObject;

public class DressesPageTest {
	HomePageObject HomePage;
	 Basepage  Bpage;
	 
	public DressesPageTest(){
		HomePage =new HomePageObject();
		 Bpage =new  Basepage();

	}
	@Test(enabled=false)
	public void sizeSmallMediumLargeIsDisplayed(){
		HomePage.getlinkedTextDresses().click();
		Assert.assertTrue(HomePage.getTxtSizeSmall().isDisplayed());
		Assert.assertTrue(HomePage.getTxtSizeMedium().isDisplayed());
		Assert.assertTrue(HomePage.getTxtSizeLarge().isDisplayed());
	}
	@Test
	public void countOfDescribtionlessthan150(){
		HomePage.getlinkedTextTshirts().click();
		HomePage.mouseHoverOnElement(HomePage.getProductElementOnTshirtPage());
		HomePage.getBtnMoreOptionOnProduct().click();
		Assert.assertTrue(HomePage.gettingtextfromdescription());
		
		
		
	}
}
	
	
	