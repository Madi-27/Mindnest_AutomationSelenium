package com.testprosss.home;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ExternalLobby {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalLobby externalloby = new ExternalLobby();
		externalloby.invokebrowsers();

	}
	
	@SuppressWarnings("deprecation")
	public void invokebrowsers()
	{
		try {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Madiha Iqbal\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setCapability("marionette", true);
		    driver = new FirefoxDriver(firefoxOptions);
			
			
			
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			
			driver.get("https://api.mindnest.app/lobby/provider");

//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//			wait.until(ExpectedConditions.urlToBe("https://login.mindnest.app/intake/signup"));
			//openBlogs();
			//verifyElemntsOnPageTest();
			
			
			Thread.sleep(10000);

			ExternallobbyFunc();
			
		
			   
			
			
			
			

			
			
			
			//loginRedirectionTest();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			

		}
		


	}
	
	@Test
	public void ExternallobbyFunc(){    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	          
		WebElement addPhNum = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/form/div/input"));
		addPhNum.sendKeys("(205) 757-5727");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	    
		WebElement addnumber = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/form/button"));

		addnumber.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		WebElement newPAtient = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[9]/div/form/div[3]/div[1]/ul/li[1]/label/span"));

		newPAtient.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		WebElement continue_newPAtient = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[9]/div/form/div[3]/div[2]/div/button"));

		continue_newPAtient.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		WebElement myself_check = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/form/div[3]/ul/li[1]/label/span"));

		myself_check.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		WebElement continue_myself = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/form/button"));

		continue_myself.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		registermyself();
		
		
	}
	
	public void registermyself() {
		
		 String fname = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]")).getText();
		 String lname = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]")).getText();


		  WebElement firstname_expatient = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]"));
		  firstname_expatient.sendKeys(fname);
		  
		  WebElement lastname_extpatient = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]"));
		  lastname_extpatient.sendKeys(lname);
		  
		  
		  
		  
		  WebElement MM_monthexpatient = driver.findElement(By.xpath("//*[@id=\"IndependentMonth\"]"));
		  MM_monthexpatient.sendKeys("05");
		  WebElement mm_patientday = driver.findElement(By.xpath("//*[@id=\"IndependentDay\"]"));
		  mm_patientday.sendKeys("05");
		  
		   
		  WebElement patientyears = driver.findElement(By.xpath("//*[@id=\"IndependentYear\"]"));
		  patientyears.sendKeys("1991");
		  
//		  WebElement dropdown = driver.findElement(By.id("select2-siTime-results"));
//		  dropdown.click();
//		  List<WebElement> options = dropdown.findElements(By.className("select2-results__option"));
//		  options.get(4).click();
		  
		  
		  
		  
		  
		  
		  
//		  Select se=new Select(driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[3]/span[1]")));  
//		  se.selectByVisibleText("Male");
	//	
		  
		
		  
		  
	//
//		   
		  WebElement gender = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[2]/div[3]/span[1]/span[1]/span"));
		  gender.click();
//		  
		

		  WebElement genderone = driver.findElement(By.xpath("//*[@id=\"select2-fn-IndependentGender-results\"]"));
		  genderone.click();
		  
	}
	}


