package com.wp.automation.page;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wp.automation.page.MainActivityPage;

import common.ActionBarHelper;
import login.LoginHelper;

public class MainActivityPageTest extends LoginHelper {
	MainActivityPage map = new MainActivityPage(driver);
	ActionBarHelper hh = new ActionBarHelper(driver);

	@BeforeMethod
	public void beforeMethod() {
		hh.clickWordPressTab();
	}

	/**
	 * Click Switch Site Element
	 */
	@Test(enabled = true)
	public void clickSwitchSite() {
		map.clickSwitchSite();
		Assert.assertEquals(getCurrentActivity(), ".ui.main.SitePickerActivity");
	}

	/**
	 * Click View Site Element
	 */
	@Test(enabled = true)
	public void clickViewSite() {
		map.clickViewSite();
		Assert.assertEquals(getCurrentActivity(), ".ui.ViewSiteActivity");
	}

}
