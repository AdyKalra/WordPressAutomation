package common;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Generic class to be called by all Test classes to implement Desired
 * Capabilities
 * 
 * @author jmatharu - Jagdeep Singh Matharu
 *
 */
public class DesiredCapabilitiesHelper {

	/**
	 * Desired Capabilities for Android Application
	 * 
	 * @return Android DesiredCapabilities
	 */
	public DesiredCapabilities setupAndorid() {
		File app = getApplication("apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("deviceName", "192.168.57.101:5555");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "org.wordpress.android");
		capabilities.setCapability("appActivity", ".ui.WPLaunchActivity");
		capabilities.setCapability("autoAcceptAlerts", true);
		return capabilities;
	}

	/**
	 * Desired Capabilities for iOS Application
	 * 
	 * @return iOS DesiredCapabilities
	 */
	public DesiredCapabilities setupIOS() {
		File app = getApplication("ipa");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		return capabilities;
	}

	/**
	 * Getting application from project path to be used by Desired Capabilities
	 * 
	 * @param appExt
	 * @return
	 */
	public File getApplication(String appExt) {
		File classPath = new File(System.getProperty("user.dir"));
		File appDir = new File(classPath, "/app");
		File app = new File(appDir, "wordpress511." + appExt);
		return app;
	}
}
