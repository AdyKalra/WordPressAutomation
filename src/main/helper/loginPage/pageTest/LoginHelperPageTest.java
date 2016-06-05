package loginPage.pageTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.wp.automation.page.MainActivityPage;

import common.WPAppiumTemplate;
import common.data.ReadFromCSV;
import loginPage.page.LoginHelperPage;

public class LoginHelperPageTest extends WPAppiumTemplate {
	LoginHelperPage loginHelperPageObject = new LoginHelperPage(driver);
	ReadFromCSV readFromCSVObject = new ReadFromCSV();
	MainActivityPage mainActivityObj = new MainActivityPage(driver);

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(enabled = true)
	public void clickSignIn() throws InterruptedException {
		loginHelperPageObject.enterUserName(readFromCSVObject.getLoginUserName());
		loginHelperPageObject.enterPassword(readFromCSVObject.getLoginPassword());
		loginHelperPageObject.clickSignIn();
		Assert.assertEquals(getCurrentActivity(), ".ui.main.WPMainActivity");
	}

	@Test(enabled = false)
	public void enterPassword() {
		loginHelperPageObject.enterPassword(readFromCSVObject.getLoginPassword());
	}

	@Test(enabled = false)
	public void enterUserName() {
		loginHelperPageObject.enterUserName(readFromCSVObject.getLoginUserName());
	}
}
