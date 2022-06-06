package com.testprosss.home;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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


public class IntakeForm {
	WebDriver driver;
	public static void main(String[] args) {
		IntakeForm intakeform = new IntakeForm();
		intakeform.invokebrowsers();
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
		
		driver.get("https://api.mindnest.app/Account/login");

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
          
	WebElement PatientLogin_Email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
    PatientLogin_Email.sendKeys("testjeni99008103@mailinator.com");


    
    WebElement PatientLogin_Password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
    PatientLogin_Password.sendKeys("Test@0099001212");

    WebElement logging = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/button"));
    logging.click();
try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
//
//    	  
//    	  

    
    introScreenNavigation();
   
}
  


public void introScreenNavigation() {
	
	
	 
	 
	 
	  WebElement intakeRegistration = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div[2]/section/div[1]/div/ol/li[1]/div/div[1]/button") );
	  intakeRegistration.click();
	  ///JavascriptExecutor executor = (JavascriptExecutor)driver;
	  //executor.executeScript("arguments[0].click();", intakeRegistration );
	 
	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  WebElement statusses = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span"));
	  statusses.click();
	  
	  
	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
	    //PatientSignUp_SMSNotification.click();
	          try {
				Thread.sleep(11000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   WebElement patientstatus = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[2]/div/button"));
	   patientstatus.click();
	   
	  
	intakeRegistrationProcess();
	
	 
}



  public void intakeRegistrationProcess() {
	
	  aboutSelf();
	
}

public void aboutSelf() {
	  try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  WebElement selfcheck = driver.findElement(By.xpath("//*[@id=\"IntakeDependencyForm\"]/div[2]/ul/li[1]/label/span"));
	  selfcheck.click();
	  
	  
	 //boolean statusPatient = driver.findElement(By.xpath("//*[@id=\"IntakePatientStatusForm\"]/div[2]/div[1]/ul/li[1]/label/span")).isEnabled();
	    //PatientSignUp_SMSNotification.click();
	          try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   WebElement patientstatus = driver.findElement(By.xpath("//*[@id=\"IntakeDependencyForm\"]/button/span"));
	   patientstatus.click();
	   
	  mySelfInfoForm();
	
}

public void  mySelfInfoForm() {
	  try {
			Thread.sleep(7000);
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
	  
	
	  
	  
//
//	   
	  WebElement gender = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[2]/div[3]/span[1]/span[1]/span"));
	  gender.click();
//	  
	

	  WebElement genderone = driver.findElement(By.xpath("//*[@id=\"select2-fn-IndependentGender-results\"]"));
	  genderone.click();
	  
	  
	
	  //Select drpdwn=new Select(driver.findElement(By.xpath("//*[@id=\"select2-fn-IndependentGender-results\"]")));
	   //drpdwn.selectByVisibleText("Male");
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
//	  //*[@id="IndependentFullAddress"]
	  
	  
	   
	  WebElement addresses = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/form/div[2]/div[4]/input"));
//	  addresses.click();
addresses.sendKeys("10425 Old Huffmeister Road, Texas, Cypress, 77429");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
List <WebElement> listItems = driver.findElements(By.xpath("/html/body/div[3]/div"));
listItems.get(0).click();
//	  try {
//		Thread.sleep(6000);
//		WebElement addresseslines = driver.findElement(By.xpath("/html/body/div[3]/div"));
//		  
//		  
//		  addresseslines.click();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	  
	  
		  WebElement submitform = driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[6]/div"));
			 submitform.click();
	
	  	  
	  
	 //addresseslines.submit();
	  //addresses.submit();
	
	
	  
	  
//	  try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	  
	  
	  
//	  try {
//		Thread.sleep(3000);
//		 WebElement submitform = driver.findElement(By.xpath("//*[@id=\"IntakeIndependentPatientForm\"]/div[2]/div[6]/div"));
//		 submitform.click();
//		 
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	 
	  
	  
			 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
			 
	  
			 WebElement skiplicense = driver.findElement(By.xpath("/html/body/div[2]/div/div[7]/div/div[3]/button"));
			 skiplicense.click();

			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
			 WebElement insuranceBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div[8]/div/button"));
			 insuranceBtn.click();
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
			 WebElement pharamacyclick = driver.findElement(By.xpath("/html/body/div[2]/div/div[9]/div/form/div[2]/ul/li[1]/label/span"));
			 pharamacyclick.click();
			 
			 
			 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			 
			 WebElement medicationcontinue = driver.findElement(By.xpath("/html/body/div[2]/div/div[9]/div/form/button"));
			 medicationcontinue.click();


			  WebElement medico = driver.findElement(By.xpath("/html/body/div[2]/div/div[11]/div/form/div[1]/span/span[1]/span"));
//			  addresses.click();
		medico.sendKeys("Safetussin DM (oral - liquid) 20 mg-200 mg/10 mL");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List <WebElement> listmedications = driver.findElements(By.xpath("/html/body/div[2]/div/div[11]/div/form/div[1]/span/span[1]/span/ul/li[1]"));
		listmedications.get(0).click();
		
		
				
				
			 
			 
}





























}
