package com.testprosss.home;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage {
	WebDriver driver;
	public static void main(String[] args) {
		RegistrationPage signup = new RegistrationPage();
		signup.invokebrowsers();
//		RegistrationPage loginpro = new RegistrationPage();
//		loginpro.testlogin(); 
		
		
		// TODO Auto-generated method stub

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
		
		driver.get("https://api.mindnest.app/intake/signup");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		wait.until(ExpectedConditions.urlToBe("https://login.mindnest.app/intake/signup"));
		//openBlogs();
		//verifyElemntsOnPageTest();
		
		
		Thread.sleep(10000);

		validRegistrationTest();
		
	
		   
		
		
		
		

		
		
		
		//loginRedirectionTest();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		

	}
	


}
//@Test
//public void verifyElemntsOnPageTest()
//{
//	WebElement firstname = driver.findElement(By.xpath("//input[@name='PatientSignUp.FirstName']"));
//	firstname.isDisplayed();
//	WebElement lastname = driver.findElement(By.xpath("//input[@name='PatientSignUp.LastName']"));
//	lastname.isDisplayed();
// 
//}


//@Test
//public void loginRedirectionTest()
//{
//	try {
//		Thread.sleep(5000);
//		
//		//driver.findElement(By.linkText("SIGN IN")).click();
//		
//		WebElement ee = driver.findElement(By.xpath("//a[@id='btnAccount']"));
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", ee);
//Set <String> allWindows = driver.getWindowHandles();
//    	
//    	for(String handle : allWindows)
//    	{
//    		driver.switchTo().window(handle);
//    	}
////		String expectedURL = "https://login.mindnest.app/Account/login";
////		
////		String actualURL = driver.getCurrentUrl();
////		System.out.println(actualURL);
////		System.out.println(expectedURL);
//		//Assert.assertEquals(actualURL, expectedURL);
//		
//		
//	
//		
//		
//		
//		//a
//		
////	String expectedTitle = "Login - LambdaTest";
////	String actualTitle = driver.getTitle();
////	//System.out.println(actualTitle);
////
////	Assert.assertEquals(actualTitle, expectedTitle);    
////	Assert.assertEquals(actualTitle, expectedTitle);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}




//Registration with all valid data

@Test
public void validRegistrationTest(){            
          
    WebElement PatientSignUp_FirstName = driver.findElement(By.xpath("//input[@name='PatientSignUp.FirstName']"));
    PatientSignUp_FirstName.sendKeys("Test");
    WebElement PatientSignUp_LastName = driver.findElement(By.xpath("//input[@name='PatientSignUp.LastName']"));
    PatientSignUp_LastName.sendKeys("Jenifer");
         
    WebElement PatientSignUp_PhoneNumber = driver.findElement(By.xpath("//input[@name='PatientSignUp.PhoneNumber']"));
    PatientSignUp_PhoneNumber.sendKeys("20576520093");
         
    WebElement PatientSignUp_Email = driver.findElement(By.xpath("//input[@name='PatientSignUp.Email']"));
    PatientSignUp_Email.sendKeys("madihaiqbal+8230@gmail.com");
   
    
    
    
    WebElement PatientSignUp_Password = driver.findElement(By.xpath("//input[@name='PatientSignUp.Password']"));
    PatientSignUp_Password.sendKeys("Test@1230099");
     

   

   boolean PatientSignUp_SMSNotification = driver.findElement(By.xpath("//input[@name='PatientSignUp.SmsNotification']")).isEnabled();
    //PatientSignUp_SMSNotification.click();
          try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   WebElement signUp = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/button"));
    signUp.click();
    
   CodeVerification();
    //driver.findElement(By.className("btn btn-lg")).click(); 
    //driver.findElement(By.cssSelector(".btn.btn-lg")).click();
    
//    String expectedURL = "https://accounts.lambdatest.com/email/verify";
//    String actualURL = driver.getCurrentUrl();
//    Assert.assertEquals(actualURL, expectedURL);
//    
//    String expectedTitle = "Verify Your Email Address - LambdaTest";
//    String actualTitle = driver.getTitle();
//    Assert.assertEquals(actualTitle, expectedTitle);
            
}
  
public void CodeVerification() {
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    WebElement pincode_01 = driver.findElement(By.xpath("//input[@name='pincode-1']"));
    pincode_01.sendKeys("0");
    WebElement pincode_02 = driver.findElement(By.xpath("//input[@name='pincode-2']"));
    pincode_02.sendKeys("0");
    WebElement pincode_03 = driver.findElement(By.xpath("//input[@name='pincode-3']"));
    pincode_03.sendKeys("0");
    WebElement pincode_04 = driver.findElement(By.xpath("//input[@name='pincode-4']"));
    pincode_04.sendKeys("0");
    
    WebElement pincode_05 = driver.findElement(By.xpath("//input[@name='pincode-5']"));
    pincode_05.sendKeys("0");
    WebElement pincode_06 = driver.findElement(By.xpath("//input[@name='pincode-6']"));
    pincode_06.sendKeys("0");
    
    
    WebElement codeV = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/div[2]/div/button"));
    codeV.click();
    try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
introScreenNavigation();

    
}

public void introScreenNavigation() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 WebElement introOne = driver.findElement(By.xpath("//*[@id=\"intro-btn-1\"]"));
	 introOne.click();
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement introTwo = driver.findElement(By.xpath("//*[@id=\"intro-btn-2\"]"));
	 introTwo.click();
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement introThree = driver.findElement(By.xpath("//*[@id=\"intro-btn-3\"]"));
	 introThree.click();
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement introFour = driver.findElement(By.xpath("//*[@id=\"intro-btn-4\"]"));
	 introFour.click();
	 
	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	
	 WebElement finishBtn = driver.findElement(By.xpath("//*[@id=\"intro-5\"]/div/div[2]/div/button"));
	 finishBtn.click();
	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//	 WebElement intakeRegistration = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div/section/div[1]/ol/li[1]/div/div[1]/button"));
//	 intakeRegistration.click();
	 
	
	 
	 
	 
	  WebElement intakeRegistration = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div[2]/section/div[1]/div/ol/li[1]/div/div[1]/button") );
	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", intakeRegistration );
	 
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	  WebElement statusses = driver.findElement(By.xpath("	//*[@id=\"PatientStatusYes\"]"));
	  JavascriptExecutor executortwo = (JavascriptExecutor)driver;
	  executortwo.executeScript("arguments[0].click();", statusses );
	  //statusses.click();
	  

	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
	    //PatientSignUp_SMSNotification.click();
	          try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	   WebElement patientstatus = driver.findElement(By.cssSelector("#IntakePatientStatusForm .btn-lg"));
	   JavascriptExecutor executortii = (JavascriptExecutor)driver;
		  executortii.executeScript("arguments[0].click();", patientstatus );
	   //patientstatus.click();
	   
	  
	intakeRegistrationProcess();
	
	 
}

  public void intakeRegistrationProcess() {
	
	  aboutSelf();
	
}

public void aboutSelf() {
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
 WebElement selfcheck = driver.findElement(By.xpath("//*[@id=\"DependencyNo\"]"));
 JavascriptExecutor executortiii = (JavascriptExecutor)driver;
 executortiii.executeScript("arguments[0].click();", selfcheck );
	  //selfcheck.click();
	  
	  
	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
	    //PatientSignUp_SMSNotification.click();
	          try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   WebElement patientstatus = driver.findElement(By.cssSelector("#IntakeDependencyForm .btn-lg"));
	   patientstatus.click();
	   
	  mySelfInfoForm();
	
}

public void  mySelfInfoForm() {
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	
	  
	
	 String fname = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]")).getText();
	 String lname = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]")).getText();


	  WebElement firstname = driver.findElement(By.xpath("//*[@id=\"IndependentFirstName\"]"));
	  firstname.sendKeys(fname);
	  
	  WebElement lastname = driver.findElement(By.xpath("//*[@id=\"IndependentLastName\"]"));
	  firstname.sendKeys(lname);
	  
	  
	  
	  
	  WebElement MM_month = driver.findElement(By.xpath("//*[@id=\"IndependentMonth\"]"));
	  MM_month.sendKeys("05");
	  WebElement patientday = driver.findElement(By.xpath("//*[@id=\"IndependentDay\"]"));
	  patientday.sendKeys("05");
	  
	   
	  WebElement patientyear = driver.findElement(By.xpath("//*[@id=\"IndependentYear\"]"));
	  patientyear.sendKeys("1991");
	  
//	  WebElement dropdown = driver.findElement(By.id("select2-siTime-results"));
//	  dropdown.click();
//	  List<WebElement> options = dropdown.findElements(By.className("select2-results__option"));
//	  options.get(4).click();
	  
	  
	  
	  
	  
	  
	  
//	  Select se=new Select(driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[3]/span[1]")));  
//	  se.selectByVisibleText("Male");
//	
	  
	
	  
	  
//-----------------------------------------------------
//	   
//	  WebElement gender = driver.findElement(By.cssSelector("#IntakeIndependentPatientForm .select2-container "));
//	  gender.click();
////	  
//	  
//
//	  WebElement genderone = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[1]/div[3]/span[1]"));
//	  genderone.click();
//	
//	  Select drpdwn=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[1]/div[3]/span[1]")));
//	    drpdwn.selectByVisibleText("Male");
	    //drpdwn.selectByIndex(2);
//	  
//	  
//	  
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  
//	  
//	  
//	  
//	-----------------------------------
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement gender = driver.findElement(By.cssSelector("#IntakeIndependentPatientForm .select2-container "));
		  gender.click();
//		  
		 
		

		  WebElement genderone = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[1]/div[3]/select/option[2]"));
		  JavascriptExecutor exc_drpdown = (JavascriptExecutor)driver;
		  exc_drpdown.executeScript("arguments[0].scrollIntoView();",genderone);

		  //exc_drpdown.executeScript("arguments[0].click();",  );
		  genderone.click();
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
		  Select drpdwn=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[1]/div[3]/select/option[2]")));
		    drpdwn.selectByVisibleText("Male");
		    //drpdwn.selectByIndex(2);
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		   	
	    
	    
	    
	    
	    
	    
	    //-----0-j-------------------------
	  
	  WebElement addresses = driver.findElement(By.id("IndependentFullAddress"));
	  addresses.sendKeys("Street, 4148 Circle Drive. City, Houston");
	
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 WebElement submitform = driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[6]/div"));
 submitform.click();
 
	  
	  
	
}





























}
