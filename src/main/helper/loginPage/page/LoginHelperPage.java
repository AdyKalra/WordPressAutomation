package loginPage.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.WPAppiumPageTemplate;

public class LoginHelperPage extends WPAppiumPageTemplate {

	public LoginHelperPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//android.widget.EditText[@resource-id='org.wordpress.android:id/nux_username']")
	private WebElement userName;

	@FindBy(xpath = "//android.widget.EditText[@resource-id='org.wordpress.android:id/nux_password']")
	private WebElement password;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='org.wordpress.android:id/nux_sign_in_button']")
	private WebElement signInButton;

	/**
	 * Enter User Name
	 * 
	 * @param enterName
	 */
	public void enterUserName(String enterName) {
		userName.sendKeys(enterName);
	}

	/**
	 * Enter Password
	 * 
	 * @param enterPassword
	 */
	public void enterPassword(String enterPassword) {
		password.sendKeys(enterPassword);
	}

	/**
	 * Click Sign-In
	 */
	public void clickSignIn() {
		signInButton.click();
	}

}
