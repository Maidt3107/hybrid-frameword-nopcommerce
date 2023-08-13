package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	// hàm khởi tạo
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		System.out.println("Driver at Home Page Object =" + driver.toString());

	}

	public void clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);

	}

}
