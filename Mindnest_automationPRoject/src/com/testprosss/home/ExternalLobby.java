package com.testprosss.home;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

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
			
			
			Thread.sleep(20000);

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
			Thread.sleep(6000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	          
		WebElement addPhNum = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/form/div/input"));
		addPhNum.sendKeys("(205) 757-9990");
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
		
		
		 String fname = "Test";
		 String lname = "Stephen";


		  WebElement firstname_expatient = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[1]/div[1]/div/input"));
		  firstname_expatient.sendKeys(fname);
		  
		  WebElement lastname_extpatient = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[1]/div[2]/div/input"));
		  lastname_extpatient.sendKeys(lname);
		  
		  
		  
		  
		  WebElement MM_monthexpatient = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[2]/div[1]/input"));
		  MM_monthexpatient.sendKeys("05");
		  WebElement mm_patientday = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[2]/div[2]/input"));
		  mm_patientday.sendKeys("05");
		  
		   
		  WebElement patientyears = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[2]/div[3]/input"));
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
		  WebElement gender = driver.findElement(By.xpath("//*[@id=\"IndependentPatient-form\"]/div[3]/div[3]/span[1]/span[1]/span"));
		  gender.click();
//		  
		

		  WebElement genderone = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]"));
		  genderone.click();
		  
		  
		
		  Select drpdwn=new Select(driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")));
		    drpdwn.selectByVisibleText("Male");
		    //drpdwn.selectByIndex(2);
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
//		  
//		    WebElement element = driver.findElement(By.xpath(""));
//	    JavascriptExecutor jsss= (JavascriptExecutor) driver;
//	    jsss.executeScript("arguments[0].click();", element); 
//		    
		 
		    WebElement btnsf = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/form/button"));

			btnsf.click();


	}
	}


