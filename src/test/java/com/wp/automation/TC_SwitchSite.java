package com.wp.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wp.automation.page.ChooseSitePage;
import com.wp.automation.page.MainActivityPage;

import login.LoginHelper;

public class TC_SwitchSite extends LoginHelper {
	MainActivityPage map = new MainActivityPage(driver);
	ChooseSitePage csp;

	@Test
	public void testSwitchSite() {
		csp = map.clickSwitchSite();
		Assert.assertEquals(csp.getSiteTitle(), "testwp02");
		Assert.assertEquals(csp.getSiteDomain(), "testwp02.wordpress.com");
	}
}
