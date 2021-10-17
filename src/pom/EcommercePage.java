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
		waitUntilPresent(By.xpath(dataSet.xpLoader));
		waitUntilNotPresent(By.xpath(dataSet.xpLoader));
	}
	
	public void registerUser(String userEmail, String userPassword) {
		// Make Log In on web page
		waitLoader();
		waitUntilClickable(By.xpath(dataSet.signUpXpath));
		click(By.xpath(dataSet.signUpXpath));
		waitUntilNotPresent(By.xpath(dataSet.xpLoader));
		waitUntilClickable(By.xpath(dataSet.xpCloseSignUpModal));
		waitUntilClickable(By.xpath(dataSet.xpNewAccount));
		click(By.xpath(dataSet.xpNewAccount));
		waitUntilClickable(By.xpath(dataSet.xpUserName));
		writeText(dataSet.userName, By.xpath(dataSet.xpUserName));
		writeText(dataSet.userEmail, By.xpath(dataSet.xpEmail));
		writeText(dataSet.userPassword, By.xpath(dataSet.xpPassword));
		writeText(dataSet.userPassword, By.xpath(dataSet.xpPasswordConfirm));
		waitUntilClickable(By.xpath(dataSet.xpOffersSpam));
		click(By.xpath(dataSet.xpOffersSpam));
		waitUntilClickable(By.xpath(dataSet.xpCheckAgree));
		waitUntilClickable(By.xpath(dataSet.xpCheckAgree));
		click(By.xpath(dataSet.xpCheckAgree));
		waitUntilClickable(By.xpath(dataSet.xpRegisterButton));
		click(By.xpath(dataSet.xpRegisterButton));

	}
	
	public void writeSearchItem(String itemName) {
		//waitLoader();
	    waitUntilClickable(By.xpath(dataSet.xpSearchButton));
	    click(By.xpath(dataSet.xpSearchButton));
	    waitUntilPresent(By.xpath(dataSet.xpSearchBoxClose));
	    //waitUntilClickable(By.xpath(dataSet.xpSearchBox));
	    //waitUntilPresent(By.xpath(dataSet.xpSearchBox));
	    //waitUntilPresent(By.xpath(dataSet.xpSearchBoxClose));
	    waitUntilPresent(By.xpath(dataSet.xpSearchBoxXpanded));
	    click(By.xpath(dataSet.xpSearchBox));
	    writeTextSlow(dataSet.itemName, By.xpath(dataSet.xpSearchBox));
	    
	}

	public void searchEnterItem(String itemName) {
		// Search for the itemName in the search bar
		
	}

	
}