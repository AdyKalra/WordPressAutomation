package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wp.automation.page.MainActivityPage;

public class ActionBarHelper extends WPAppiumPageTemplate {

	public ActionBarHelper(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//android.widget.FrameLayout[@index='0']")
	private WebElement mainActivityTab;

	public MainActivityPage clickWordPressTab() {
		mainActivityTab.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
		return new MainActivityPage(driver);
	}

}
