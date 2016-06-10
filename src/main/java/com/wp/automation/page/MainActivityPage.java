package com.wp.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.WPAppiumPageTemplate;

public class MainActivityPage extends WPAppiumPageTemplate {

	public MainActivityPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Switch Site']")
	private WebElement switchSite;

	@FindBy(xpath = "//android.widget.TextView[@text='View Site']")
	private WebElement viewSite;

	/**
	 * Click Switch Site
	 * 
	 * @return
	 */
	public ChooseSitePage clickSwitchSite() {
		switchSite.click();
		return new ChooseSitePage(driver);
	}

	/**
	 * Click View Site
	 * 
	 * @return
	 */
	public ViewSitePage clickViewSite() {
		viewSite.click();
		return new ViewSitePage(driver);
	}
}
