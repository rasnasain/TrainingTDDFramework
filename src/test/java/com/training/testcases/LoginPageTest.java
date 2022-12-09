package com.training.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.TestBase;
import com.training.pages.DashboardPage;
import com.training.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends TestBase {
	LoginPage lp = new LoginPage();
	DashboardPage dp;
	
	@BeforeMethod
	public void beforeSetup() throws IOException {
		initialization();
	}
	
	@Test
	public void appLoadCheckTest() {
		boolean ispresent = lp.appLoad();
		Assert.assertTrue(ispresent);
	}
	
	@Test
	public void validatePageTitleTest() {
		String ExpectedTitle = "OrangeHRM";
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	@Test
	public void validateLoginTest() throws InterruptedException {
		dp = lp.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(1000);
		Assert.assertTrue(dp.dashboardPageHeader());
	}
	
	@Test
	public void forgertPasswordLinkTest() throws InterruptedException {
		lp.clickForgetPasswordLink();
		
	}
	
	@AfterMethod
	public void afterSetup() {
		tearDown();
	}
	

}
