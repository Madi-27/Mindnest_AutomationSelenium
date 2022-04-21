package com.testprosss.home;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
public class testcalss {
	

	public static void main(String[] args) {
		WebDriver driver;
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\Madiha Iqbal\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

			FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setCapability("marionette", true);
		    driver = new FirefoxDriver(firefoxOptions);
			
			
			
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			  driver.get("https://www.google.com/");
			  driver.findElement(By.name("q"))
		      .sendKeys("testing selenium");
		List<WebElement> options = new WebDriverWait(driver, 30).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("[role='option']"), 0));
		int index = (int) (Math.random() * options.size());
		options.get(index)
		       .click();
		
	}}
