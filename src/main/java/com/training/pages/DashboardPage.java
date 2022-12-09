package com.training.pages;

import org.openqa.selenium.By;

import com.training.base.TestBase;

public class DashboardPage extends TestBase{
	
	public boolean dashboardPageHeader() {
		return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	}
	
	public boolean timeAtWork() {
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}

}
