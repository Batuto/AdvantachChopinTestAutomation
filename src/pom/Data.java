package pom;


public class Data {
	
	
	// Testing URL
	String testingURL = "http://advantageonlineshopping.com/#/";
	
	// Data
	String userName = "UserTestZ1";  // Change for every test.
	String userEmail = "demo@advantachchopin.test";
	String userPassword = "demoAlpha123";
	String itemName = "mouse";
	
	// LOCATORS
	
	// Main Page
	String xpLoader = "/html/body/div[2][@class='loader']";
	
	// Sign-Up
	String xpCloseSignUpModal = "/html/body/login-modal/div/div/div[2]";
	//String signUpXpath = "//li/a[contains(@class,'nav-link font-weight-bold')]";
	String signUpXpath = "//a[@aria-label='UserMenu']//a[@title='USER']//*[name()='svg']";
	String xpNewAccount = "//a[normalize-space()='CREATE NEW ACCOUNT']";
	String xpUserName = "//input[@name='usernameRegisterPage']";
	String xpEmail = "//input[@name='emailRegisterPage']";
	String xpPassword = "//input[@name='passwordRegisterPage']";
	String xpPasswordConfirm = "//input[@name='confirm_passwordRegisterPage']";
	String xpOffersSpam = "//*[@id='formCover']/div[4]/input";
	String xpCheckAgree = "//input[@name='i_agree']";
	String xpRegisterButton = "//button[text()='REGISTER']";
	String xpMenuUserLinkWName = "//li/a[@id='menuUserLink']/span";
	
	
	// Search Item
	String xpSearchButton = "//a[@class='img']//descendant::div[@id='searchSection']//descendant::a";
	String xpSearchBox = "//div[@class='autoCompleteCover']/input[@id='autoComplete']";
	String xpSearchBoxXpanded = "//div[@class='autoCompleteCover' and contains(@style,'opacity: 1;')]";
	String xpSearchBoxClose = "//div[@class='autoCompleteCover']/div[contains(@data-ng-click, 'close')]/img";
	// String searchButtonXpath = "//button[@type='submit' and contains(@class, 'oe_search_button')]";
	String searchButtonXpath = "//button[@class='btn btn-primary oe_search_button' and @type='submit']/parent::div[@class='input-group-append']";
	String xpFirstItemResult = "//div/div[2]/div/div[2]/a[2]";
	String xpFirstItem2ndResult = "//*[@id='searchPage']/div[3]/div/div/div[2]/ul/li[1]";
	
	// Add item to cart
	String xpItemName = "//div[@id='Description']/h1";
	String xpPlusItem = "//div[@id='productProperties']/descendant::div[@class='plus']";
	String xpAddToCartBtn = "//button[@name='save_to_cart']";	
	String xpShoppingCartLink = "//a[@id='shoppingCartLink']/span[contains(@class, 'cart')]";
	String xpItemCount = "//div[2]/input[@name='quantity']";
	
}