package com.app.pages;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageObject extends Basepage {

	@FindBy(linkText = "Women")//*[@id="block_top_menu"]/ul/li[2]/a
	private WebElement linkedTextWomen;

	

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement linkedTextTshirts;

	@FindBy(xpath = "//span[contains(text() ,'T-shirts ')]")
	private WebElement txtTshirtsOnNextPage;

	@FindBy(xpath = "//div//p[@class='alert alert-success'] ")                                                          // xpath for
	private WebElement txtEmailSubsciptionMessage;															// textwomen in
																
	private WebElement txtWomenonNextPage;

	@FindBy(xpath = "//*[@id='center_column']//h1//span[1]") 
	private WebElement txtDressesonNextPage;

	@FindBy(id = "newsletter-input")
	private WebElement emailSubcribtion; 

	@FindBy(xpath = "//*//div//button[@name='submitNewsletter']")
	private WebElement clickEmailSubcribtion; 

	@FindBy(xpath = "(//label/a)[4]")
	private WebElement txtSizeSmall;

	@FindBy(xpath = "(//label/a)[5]")
	private WebElement txtSizeMedium;

	@FindBy(xpath = "(//label/a)[6]")
	private WebElement txtSizeLarge;

	@FindBy(xpath = "(//p//button)[2]")
	private WebElement btnShare;

	@FindBy(xpath = "(//p//button)[1]")
	private WebElement btnTweet;

	@FindBy(xpath = "(//a//span[text()='More'])[1]")
	private WebElement btnMoreOptionOnProduct;

	@FindBy(xpath = " (//div/p)[6]")
	private WebElement producDescription;

	@FindBy(xpath = " //span[text()='(empty)']")
	private WebElement cartOnEmpty;

	@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	public WebElement productElementOnTshirtPage;
	
	public List<WebElement> getTotalProductsCount() {
		return totalProductsCount;
	}
	public void setTotalProductsCount(List<WebElement> totalProductsCount) {
		this.totalProductsCount = totalProductsCount;
	}
	@FindBy(xpath = "(//p[contains( text(),'Faded short sleeve t-shirt')])[1]")
	public WebElement descriptionOfElementOnTshirtPage;
	
	@FindBy(xpath = "(//span[contains(text() ,'Women')])[3]")
	private WebElement txtWomenOnNextPage;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement linkedTextDresses;

	@FindBy(xpath = "(//span[contains(text() ,'Dresses')])[2]")
	private WebElement txtDressesOnNextPage;


	@FindBys(@FindBy(xpath = "//*[@id=\"center_column\"]/ul"))
	public List<WebElement> totalProductsCount;
	
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	public WebElement productsCountFromHeader;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	public WebElement addProductToCart;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
	public WebElement btnCart;
	
	@FindBy(xpath = "//*[@id=\"product_1_1_0_0\"]/td[2]/p/a")
	public WebElement txtaddedProductinCart;
	
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	public WebElement txtsuccessfullyaddedProductinCart;
	
	@FindBy(xpath = "//*[@id=\"short_description_content\"]/p")
	public WebElement txtDescriptioninAddedProduct;
	
	// there are 5 produdts //div//h1//span[contains(text(),'5')]
	// size small (//label/a)[4]
	// size medium (//label/a)[5]
	// size large (//label/a)[6]
	// tweet (//p//button)[1]
	// share (//p//button)[2]
	// product more (//a//span[text()='More'])[1]
	// product description (//div/p)[6]

	// cart empty //span[text()='(empty)']
	// adding to cart (//span[text()='Add to cart'])[1]
// description  (//p[contains( text(),'Faded short sleeve t-shirt')])[1]
	

	public WebElement getTxtDescriptioninAddedProduct() {
		return txtDescriptioninAddedProduct;
	}
	public void setTxtDescriptioninAddedProduct(WebElement txtDescriptioninAddedProduct) {
		this.txtDescriptioninAddedProduct = txtDescriptioninAddedProduct;
	}
	public WebElement getTxtsuccessfullyaddedProductinCart() {
		
		return txtsuccessfullyaddedProductinCart;
	}
	public boolean TxtsuccessfullyaddedProductinCart(){
		if( getTxtsuccessfullyaddedProductinCart().isDisplayed());
		return true;
	}
	public boolean gettingtextfromdescription(){
		String[] num=getTxtDescriptioninAddedProduct().getText().split(" ");
		 int wordNumber=num.length;
		 if( wordNumber<=150)
			 return true;
		 else
		return true;
	}
	
		
		
	

	public void setTxtsuccessfullyaddedProductinCart(WebElement txtsuccessfullyaddedProductinCart) {
		this.txtsuccessfullyaddedProductinCart = txtsuccessfullyaddedProductinCart;
	}

	public WebElement getTxtaddedProductinCart() {
		return txtaddedProductinCart;
	}

	public void setTxtaddedProductinCart(WebElement txtaddedProductinCart) {
		this.txtaddedProductinCart = txtaddedProductinCart;
	}

	public WebElement getAddProductToCart() {
		return addProductToCart;
	}

	public void setAddProductToCart(WebElement addProductToCart) {
		this.addProductToCart = addProductToCart;
	}

	public WebElement getBtnCart() {
		return btnCart;
	}

	public void setBtnCart(WebElement btnCart) {
		this.btnCart = btnCart;
	}

	public WebElement getDescriptionOfElementOnTshirtPage() 
{
		return descriptionOfElementOnTshirtPage;
	}

	public void setDescriptionOfElementOnTshirtPage(WebElement descriptionOfElementOnTshirtPage) {
		this.descriptionOfElementOnTshirtPage = descriptionOfElementOnTshirtPage;
	}

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getlinkedTextWomen() {
		return linkedTextWomen;
	}

	public WebElement gettxtDressesOnNextPage() {
		return gettxtDressesOnNextPage();
	}

	public int TotalProductsCount() {
	
		return  getTotalProductsCount().size();
	}
	public void setTotalProductsCount(WebElement totalProductsCount) {
		this.totalProductsCount = (List<WebElement>) totalProductsCount;
	}

	public int ProductsCountFromHeader() {
		return Integer.parseInt(productsCountFromHeader.getText().split(" ")[2]);
	}
	public Boolean verifyCountMatch(){
		
		if(ProductsCountFromHeader()== TotalProductsCount()){
			return true;	
		}
		
		return false;
	}
	
	
	
	
	
	
	
	public WebElement getlinkedTextDresses() {
		return linkedTextDresses;
	}

	public WebElement getlinkedTextTshirts() {
		return linkedTextTshirts;
	}

	public WebElement getemailSubcribtion() {

		return emailSubcribtion;
	}

	public WebElement getTxtWomenOnNextPage() {
		return txtWomenOnNextPage;
	}

	public void setTxtWomenOnNextPage(WebElement txtWomenOnNextPage) {
		this.txtWomenOnNextPage = txtWomenOnNextPage;
	}

	public WebElement getTxtTshirtsOnNextPage() {
		return txtTshirtsOnNextPage;
	}

	public void setTxtTshirtsOnNextPage(WebElement txtTshirtsOnNextPage) {
		this.txtTshirtsOnNextPage = txtTshirtsOnNextPage;
	}

	public WebElement getTxtDressesonNextPage() {
		return txtDressesonNextPage;
	}

	public void setTxtDressesonNextPage(WebElement txtDressesonNextPage) {
		this.txtDressesonNextPage = txtDressesonNextPage;
	}

	public WebElement getEmailSubcribtion() {
		return emailSubcribtion;
	}

	public void setEmailSubcribtion(WebElement emailSubcribtion) {
		this.emailSubcribtion = emailSubcribtion;
	}

	public WebElement getClickEmailSubcribtion() {
		return clickEmailSubcribtion;
	}

	public void setClickEmailSubcribtion(WebElement clickEmailSubcribtion) {
		this.clickEmailSubcribtion = clickEmailSubcribtion;
	}

	public WebElement getTxtSizeSmall() {
		return txtSizeSmall;
	}

	public void setTxtSizeSmall(WebElement txtSizeSmall) {
		this.txtSizeSmall = txtSizeSmall;
	}

	public WebElement getTxtSizeMedium() {
		return txtSizeMedium;
	}

	public void setTxtSizeMedium(WebElement txtSizeMedium) {
		this.txtSizeMedium = txtSizeMedium;
	}

	public WebElement getTxtSizeLarge() {
		return txtSizeLarge;
	}

	public void setTxtSizeLarge(WebElement txtSizeLarge) {
		this.txtSizeLarge = txtSizeLarge;
	}

	public WebElement getBtnShare() {
		return btnShare;
	}

	public void setBtnShare(WebElement btnShare) {
		this.btnShare = btnShare;
	}

	public WebElement getBtnTweet() {
		return btnTweet;
	}

	public void setBtnTweet(WebElement btnTweet) {
		this.btnTweet = btnTweet;
	}

	public WebElement getBtnMoreOptionOnProduct() {
		return btnMoreOptionOnProduct;
	}

	public void setBtnMoreOptionOnProduct(WebElement btnMoreOnProduct) {
		this.btnMoreOptionOnProduct = btnMoreOnProduct;
	}

	public WebElement getProducDescription() {
		return producDescription;
	}

	public void setProducDescription(WebElement producDescription) {
		this.producDescription = producDescription;
	}

	public WebElement getCartOnEmpty() {
		return cartOnEmpty;
	}

	public void setCartOnEmpty(WebElement cartOnEmpty) {
		this.cartOnEmpty = cartOnEmpty;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getTxtEmailSubsciptionMessage() {   // cart is empty //p[text()='Your shopping cart is empty.']
		return txtEmailSubsciptionMessage;// empty cart //span[text()='(empty)']
	}// oneproduct //div//a//span[text()='1']

	public void setTxtEmailSubsciptionMessage(WebElement txtEmailSubsciptionMessage) {
		this.txtEmailSubsciptionMessage = txtEmailSubsciptionMessage;
	}

	public void mouseHoverOnElement(WebElement Element){
		Actions ac= new Actions(driver);
		ac.moveToElement(Element).build().perform();
	}

	public WebElement getProductElementOnTshirtPage() {
		return productElementOnTshirtPage;
	}

	public void setProductElementOnTshirtPage(WebElement productElementOnTshirtPage) {
		this.productElementOnTshirtPage = productElementOnTshirtPage;
	}
	public void alert(){
		
	}
	
	}
