package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Page Object Template - This abstract class should be extended by all Page
 * Object Classes in Project for Initializing Element
 * 
 * @author jmatharu - Jagdeep Singh Matharu
 *
 */
public abstract class WPAppiumPageTemplate {
	protected WebDriver driver;

	public WPAppiumPageTemplate(WebDriver driver) {
		this.driver = driver;
		// Initialise Elements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
