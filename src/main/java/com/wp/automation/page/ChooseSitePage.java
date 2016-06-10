package com.wp.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.WPAppiumPageTemplate;

public class ChooseSitePage extends WPAppiumPageTemplate {

	public ChooseSitePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//android.widget.TextView[@resource-id='org.wordpress.android:id/text_title']")
	private WebElement siteTitle;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='org.wordpress.android:id/text_domain']")
	private WebElement siteDomain;

	/**
	 * Get Site Title
	 * 
	 * @return
	 */
	public String getSiteTitle() {
		return siteTitle.getText();
	}

	/**
	 * Get Site Domain Name
	 * 
	 * @return
	 */
	public String getSiteDomain() {
		return siteDomain.getText();
	}

}
