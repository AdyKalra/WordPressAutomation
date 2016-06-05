package com.wp.automation.pageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wp.automation.page.ChooseSitePage;
import com.wp.automation.page.MainActivityPage;

import login.LoginHelper;

public class ChooseSitePageTest extends LoginHelper {
	MainActivityPage map = new MainActivityPage(driver);
	ChooseSitePage csp;

	@BeforeClass
	public void beforeClass() {
		csp = map.clickSwitchSite();
	}

	@Test
	public void getSiteDomain() {
		Assert.assertEquals(csp.getSiteDomain(), "testwp02.wordpress.com");
	}

	@Test
	public void getSiteTitle() {
		Assert.assertEquals(csp.getSiteTitle(), "testwp02");
	}
}
