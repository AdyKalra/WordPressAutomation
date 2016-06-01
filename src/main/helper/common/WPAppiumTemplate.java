package common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

/**
 * Test Class Template - This abstract class should be extended by all Test Case
 * to implement Desired Capabilities and Driver
 * 
 * TODO: Currently only only Android, still need to work on iOS
 * 
 * @author jmatharu - Jagdeep Singh Matharu
 *
 */
public abstract class WPAppiumTemplate {

	protected AndroidDriver<WebElement> driver;
	DesiredCapabilitiesHelper dch = new DesiredCapabilitiesHelper();

	/**
	 * Default Constructor for setting up desired capabilities and Driver
	 */
	public WPAppiumTemplate() {
		DesiredCapabilities capabilities = dch.setupAndorid();
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
