package com.training.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends TestBase{
	
	public boolean appLoad() {
		return driver.findElement(By.name("username")).isDisplayed();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public DashboardPage login(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		return new DashboardPage();
	}
	
	public void clickForgetPasswordLink() {
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
	}
	
	}