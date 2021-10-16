package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class AllSuiteTest {
	
	private WebDriver driver;
	private WebDriverWait wait;
	EcommercePage ecommercePage;	
	Data dataSet;

@BeforeClass
	public void beforeClass() {
		ecommercePage = new EcommercePage(driver, wait);
		// The next line can be changed to match firefoxDriverConnection();
		// to switch from chrome browser to firefox browser.
		// You must have the compatible gecko driver in the drivers directory.
		driver = ecommercePage.chromeDriverConnection();
		wait = ecommercePage.waitConst();
		dataSet = new Data();
	}

@Test(description="This method validates the correct loading of the main page")
	public void LoadMainPage() {
		ecommercePage.visit(dataSet.testingURL);
		Boolean asertionLoadPage = ecommercePage.isDisplayed(dataSet.signUpXpath);
		//Assert.assertTrue(asertionLoadPage,"The page could not be loaded.");
	}

@Test (description="This method validates the Sign Up", dependsOnMethods="LoadMainPage")
	public void SignUpTest() {
		ecommercePage.registerUser(dataSet.userEmail, dataSet.userPassword);
		//Boolean asertionLogin = ecommercePage.isDisplayed(dataSet.userMenuSpanXpath);
		//Assert.assertTrue(asertionLogin,"The login could not be made.");
		//ecommercePage.visit(dataSet.testingURL);
	}

@Test(description="This method validates a searching for an item on the catalog", dependsOnMethods="SignUpTest")
	public void SearchItemBannerTest() {
		ecommercePage.writeSearchItem(dataSet.itemName);
		//Boolean asertionSearch = ecommercePage.isDisplayed(dataSet.secondItemXpath);
		//Assert.assertTrue(asertionSearch,"The searching could not be made.");
	}
@Test(description="This method validates a search for an item on the catalog", dependsOnMethods="SearchItemBannerTest")
    public void SearchItemEnterTest( ) {
	
}

}