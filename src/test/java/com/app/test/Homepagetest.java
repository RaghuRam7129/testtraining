package com.app.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.Basepage;
import com.app.pages.HomePageObject;

public class Homepagetest {

	HomePageObject HomePage;
	Basepage Bpage;

	public Homepagetest() {
		HomePage = new HomePageObject();
		Bpage = new Basepage();
	}

	@Test(enabled = false)
	public void verifyLinkTextWomenDisplayed() {
		//Assert.assertTrue(HomePage.getlinkedTextWomen().isDisplayed());
		HomePage.getlinkedTextWomen().click();
		Assert.assertTrue(HomePage.getTxtWomenOnNextPage().isDisplayed(), "invalid");

	}

	@Test(enabled = false)
	public void verifyLinkTextDressesDisplayed() {
		//Assert.assertTrue(HomePage.getlinkedTextDresses().isDisplayed());
		HomePage.getlinkedTextDresses().click();
		Assert.assertTrue(HomePage.getTxtDressesonNextPage().isDisplayed());

	}

	@Test(enabled = false)
	public void verifyLinkTextTshirtsDisplayed() {
		Assert.assertTrue(HomePage.getlinkedTextTshirts().isDisplayed());
		HomePage.getlinkedTextTshirts().click();
		Assert.assertTrue(HomePage.getTxtTshirtsOnNextPage().isDisplayed(), " ");
	}
	@Test
	public void verifyEmailSubscription(){
		Random random=new Random();
		random.nextInt(50);
		HomePage.getEmailSubcribtion().sendKeys("rasparrow"+random +"@gmail.com");
		HomePage.getClickEmailSubcribtion().click();
		Assert.assertTrue(HomePage.getTxtEmailSubsciptionMessage().isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
