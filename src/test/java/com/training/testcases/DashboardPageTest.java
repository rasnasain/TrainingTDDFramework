package com.training.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.TestBase;
import com.training.pages.DashboardPage;
import com.training.pages.LoginPage;

public class DashboardPageTest extends TestBase{
	
	LoginPage lp = new LoginPage();
	DashboardPage dp;
	
	@BeforeMethod
	public void beforeSetup() throws IOException {
		initialization();
	}
	
	@Test
	public void validateLoginTest() throws InterruptedException {
		dp = lp.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertTrue(dp.timeAtWork());
	}

	@AfterMethod
	public void afterSetup() {
		tearDown();
	}
}
