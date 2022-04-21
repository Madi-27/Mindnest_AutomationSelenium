package com.testprosss.home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LoginPage loginpro = new LoginPage();
		loginpro.testlogin(); 
		

	}
public void testlogin() {
		
		
	
		try {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Madiha Iqbal\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setCapability("marionette", true);
		    driver = new FirefoxDriver(firefoxOptions);
		    
		    firefoxOptions.addPreference("media.navigator.streams.fake", true);
		    firefoxOptions.addPreference("media.navigator.permission.disabled", true);
		    this.driver = new FirefoxDriver(firefoxOptions);
	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			
			driver.get("https://api.mindnest.app/Account/Login");

//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//			wait.until(ExpectedConditions.urlToBe("https://login.mindnest.app/intake/signup"));
			//openBlogs();
			//verifyElemntsOnPageTest();
			
			
			Thread.sleep(9000);

			testingLogin();
			
	
			
			//loginRedirectionTest();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}}

public void testingLogin() {
	 WebElement PatientLogin_Email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	    PatientLogin_Email.sendKeys("madiha@alarahealthcare.com");


	    
	    WebElement PatientLogin_Password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	    PatientLogin_Password.sendKeys("Pass@786");

	    WebElement logging = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/button"));
	    logging.click();
    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
//
//	    	  
//	    	  
    
    
    
   
    //code for the logout 
    /////////////////////////////////////
//	    	  WebElement taskDoneSwitch = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[2]/div[2]/a") );
//	    	  JavascriptExecutor executor = (JavascriptExecutor)driver;
//	    	  executor.executeScript("arguments[0].click();", taskDoneSwitch );	    	  
//	    	  
//	    	  
//
//	    try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    		WebElement logout = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[2]/div[2]/div/a[3]"));
//	    logout.click();	
	    
	    /////////////////////////////////
	    
    
    
    
    WebElement startcall = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[11]/form/button"));
 	startcall.click();
 	
 	
 	 try {
  		Thread.sleep(3000);
  	} catch (InterruptedException e) {
//  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
 	
 	 
	    Boolean isLoggedIn = driver.findElement(By.xpath(" /html/body/header/div/div/div/div[2]/div[2]/div/div/div/a[3]")).isDisplayed();

 	 WebElement turnon = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[1]/div[1]/button"));
     turnon.click();
 try {
 		Thread.sleep(3000);
 	} catch (InterruptedException e) {
// 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}	
//    boolean actualvalue = startcall.isEnabled();
//    if(actualvalue) {
//    	System.out.print("btn enabled");
//    	startcall.click();	
//	    try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//    else 
//    	
//    {
//    	System.out.print("btn disabled");
//
//    }
//    
    
    
 WebElement startcalls = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[11]/form/button"));
	startcalls.click();
	
	
	 try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    
    
	    
////    
////	    
//





//	    try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	 WebElement intakeRegistration = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/section/div[1]/ol/li[1]/div/div[1]/button"));
//	 intakeRegistration.click();
//
//
//
//
//
//
//	 try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  
//	  
//	  WebElement statusses = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span"));
//	  statusses.click();
//	  
//	  
//	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
//	    //PatientSignUp_SMSNotification.click();
//	          try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	   WebElement patientstatus = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[2]/div/button"));
//	   patientstatus.click();
//	   
//	  
//	intakeRegistrationProcess();
//
//
//}
//
//
//public void intakeRegistrationProcess() {
//	
//	  aboutSelf();
//	
//}
//
//public void aboutSelf() {
//	  try {
//			Thread.sleep(12000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  WebElement selfcheck = driver.findElement(By.xpath("//*[@id=\"IntakeDependencyForm\"]/div[2]/ul/li[1]/label/span"));
//	  selfcheck.click();
//	  
//	  
//	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
//	    //PatientSignUp_SMSNotification.click();
//	          try {
//				Thread.sleep(9000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	   WebElement patientstatus = driver.findElement(By.xpath("//*[@id=\"IntakeDependencyForm\"]/button/span"));
//	   JavascriptExecutor jsee = (JavascriptExecutor) driver;
//	   jsee.executeScript("arguments[0].click();",patientstatus);
//
//	   //patientstatus.click();
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	   
//	  mySelfInfoForm();
//	
//}
//
//public void  mySelfInfoForm() {
//	  try {
//			Thread.sleep(7000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  
//	
//	
//	 String fname = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]")).getText();
//	 String lname = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]")).getText();
//
//
//	  WebElement firstname = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]"));
//	  firstname.sendKeys(fname);
//	  
//	  WebElement lastname = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]"));
//	  firstname.sendKeys(lname);
//	  
//	  
//	  
//	  
//	  WebElement MM_month = driver.findElement(By.xpath("//*[@id=\"IndependentMonth\"]"));
//	  MM_month.sendKeys("05");
//	  WebElement patientday = driver.findElement(By.xpath("//*[@id=\"IndependentDay\"]"));
//	  patientday.sendKeys("05");
//	  
//	   
//	  WebElement patientyear = driver.findElement(By.xpath("//*[@id=\"IndependentYear\"]"));
//	  patientyear.sendKeys("1991");
//	  
////	  WebElement dropdown = driver.findElement(By.id("select2-siTime-results"));
////	  dropdown.click();
////	  List<WebElement> options = dropdown.findElements(By.className("select2-results__option"));
////	  options.get(4).click();
//	  
//	  
//	  
//	  
//	  
//	  
//	  
////	  Select se=new Select(driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[3]/span[1]")));  
////	  se.selectByVisibleText("Male");
////	
//	  
//	
//	  
//	  
////
////	   
//	  WebElement gender = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[2]/div[3]/span[1]/span[1]/span"));
//	  gender.click();
////	  
//	
//
//	  WebElement genderone = driver.findElement(By.xpath("//*[@id=\"select2-fn-IndependentGender-results\"]"));
//	  genderone.click();
//	  
//	  
//	
//	  Select drpdwn=new Select(driver.findElement(By.xpath("//*[@id=\"select2-fn-IndependentGender-results\"]")));
//	    drpdwn.selectByVisibleText("Male");
//	    //drpdwn.selectByIndex(2);
//	  
//	  
//	  
//	  
//	  
////	  
////	  
////	  
////	    try {
////			Thread.sleep(5000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	  
////	  
////	  
////	  
////	  
//	  
//	  
//	   
//	  WebElement addresses = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[2]/div[4]/input"));
//	  addresses.sendKeys("Street, 4148 Circle Drive. City, Houston");
//	
//	
//	  
//	  
//	  try {
//			Thread.sleep(7000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//WebElement submitform = driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[6]/div"));
//submitform.click();
//
//	  
//	  
//	
//}


}}
