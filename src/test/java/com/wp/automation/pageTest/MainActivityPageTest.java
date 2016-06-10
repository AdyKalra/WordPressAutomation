package com.wp.automation.pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wp.automation.page.MainActivityPage;

import login.LoginHelper;

public class MainActivityPageTest extends LoginHelper {
	MainActivityPage map = new MainActivityPage(driver);

	@Test(enabled = true)
	public void clickSwitchSite() {
		map.clickSwitchSite();
		Assert.assertEquals(getCurrentActivity(), ".ui.main.SitePickerActivity");
	}
}
