package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePage extends Base {
	
	private Data dataSet = new Data();
		
	public EcommercePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void waitLoader() {
		waitUntilNotPresent(By.xpath(dataSet.xpLoader));
		waitUntilPresent(By.xpath(dataSet.xpLoader));
	}
	
	public void registerUser(String userEmail, String userPassword) {
		// Make Log In on web page
		waitUntilClickable(By.xpath(dataSet.signUpXpath));
		click(By.xpath(dataSet.signUpXpath));
		waitUntilNotPresent(By.xpath(dataSet.xpLoader));
		waitUntilClickable(By.xpath(dataSet.xpNewAccount));
		click(By.xpath(dataSet.xpNewAccount));
		waitUntilClickable(By.xpath(dataSet.xpUserName));
		writeText(dataSet.userName, By.xpath(dataSet.xpUserName));
		writeText(dataSet.userEmail, By.xpath(dataSet.xpEmail));
		writeText(dataSet.userPassword, By.xpath(dataSet.xpPassword));
		writeText(dataSet.userPassword, By.xpath(dataSet.xpPasswordConfirm));
		waitUntilClickable(By.xpath(dataSet.xpCheckAgree));
		click(By.xpath(dataSet.xpCheckAgree));
		waitUntilClickable(By.xpath(dataSet.xpRegisterButton));
		click(By.xpath(dataSet.xpRegisterButton));

	}
	
	public void searchItem(String itemName) {
		// Search for the itemName in the search bar
		waitUntilClickable(By.xpath(dataSet.shopButtonXpath));
		click(By.xpath(dataSet.shopButtonXpath));
		waitUntilPresent(By.xpath(dataSet.searchInputXpath));
		writeText(itemName, By.xpath(dataSet.searchInputXpath));
		waitUntilClickable(By.xpath(dataSet.searchButtonXpath));
		click(By.xpath(dataSet.searchButtonXpath));
		
	}
		
	public void addItemToCart() {	
		// Select the item and then add two of them to the shopping cart
		waitUntilClickable(By.xpath(dataSet.secondItemXpath));
		click(By.xpath(dataSet.secondItemXpath));
		waitUntilClickable(By.xpath(dataSet.plusButtonXpath));
		click(By.xpath(dataSet.plusButtonXpath));
		waitUntilClickable(By.xpath(dataSet.addToCartButtonXpath));
		click(By.xpath(dataSet.addToCartButtonXpath));
				
	}

	public void checkOut() {
		// Here we expect to be in the shopping cart and start the checkout process
		waitUntilClickable(By.xpath(dataSet.checkOutXpath));
		click(By.xpath(dataSet.checkOutXpath));
		// The next step could be activated by other users in the test environment
		//waitUntilClickable(By.xpath(nextExtraInfoXpath));
		//click(By.xpath(nextExtraInfoXpath));
	}
	
	public void payProccess() {
		// Start the pay process (enter card number, etc.)
		waitUntilClickable(By.xpath(dataSet.cardRadioButtonXpath));
		click(By.xpath(dataSet.cardRadioButtonXpath));
		waitUntilClickable(By.xpath(dataSet.cardNumberXpath));
		writeTextSlow(dataSet.creditCardNum, By.xpath(dataSet.cardNumberXpath));
		waitUntilClickable(By.xpath(dataSet.cardHolderNameXpath));
		writeText(dataSet.creditCardHolderName, By.xpath(dataSet.cardHolderNameXpath));
		waitUntilClickable(By.xpath(dataSet.cardExpiryXpath));
		writeText(dataSet.creditCardDateMonth, By.xpath(dataSet.cardExpiryXpath));
		writeText(dataSet.creditCardDateYear, By.xpath(dataSet.cardExpiryXpath));
		waitUntilClickable(By.xpath(dataSet.cardCvvXpath));
		writeText(dataSet.creditCardCvv, By.xpath(dataSet.cardCvvXpath));
		waitUntilClickable(By.xpath(dataSet.payNowButtonXpath));
		click(By.xpath(dataSet.payNowButtonXpath));
		
	}
	
}
