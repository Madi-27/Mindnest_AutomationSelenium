package com.testprosss.home;

import java.text.Normalizer.Form;
import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalLobby {
	 WebDriver driver;
		EdgeOptions options;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalLobby externalloby = new ExternalLobby();
		externalloby.invokebrowsers();
		 
//		   
//	      EdgeOptions edgeOpts = new EdgeOptions();
//	      edgeOpts.addArguments("allow-file-access-from-files");
//	      edgeOpts.addArguments("use-fake-device-for-media-stream");
//	      edgeOpts.addArguments("use-fake-ui-for-media-stream");
//	      edgeOpts.addArguments("--disable-features=EnableEphemeralFlashPermission");
//	      driver = new EdgeDriver(edgeOpts);
//          driver.get("https://api.mindnest.app/lobby/provider");

	

	}
	
	@SuppressWarnings("deprecation")
	public void invokebrowsers()
	{
		try {
			
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Madiha Iqbal\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\Madiha Iqbal\\Downloads\\IEDriverServer_Win32_4.3.0\\IEDriverServer.exe");
			//FirefoxOptions firefoxOptions = new FirefoxOptions();
		    //firefoxOptions.setCapability("marionette", true);
		    
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Madiha Iqbal\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		    
		//driver   = new EdgeDriver();
		    //driver = new FirefoxDriver(firefoxOptions);
			
			 options = new EdgeOptions();
//			options.setCapability("dom.webnotifications.enabled", 1);
//			options.setCapability("permissions.default.microphone", 1);
//			options.setCapability("permissions.default.camera", 1);
			 
			options.addArguments("allow-file-access-from-files");
			options.addArguments("use-fake-device-for-media-stream");
			options.addArguments("use-fake-ui-for-media-stream");
			options.addArguments("--disable-features=EnableEphemeralFlashPermission");
			driver = new EdgeDriver(options);
		      
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			
		
		
			
			driver.get("https://api.mindnest.app/lobby/provider");
			

//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//			wait.until(ExpectedConditions.urlToBe("https://login.mindnest.app/intake/signup"));
			//openBlogs();
			//verifyElemntsOnPageTest();
			
			
			Thread.sleep(5000);

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
			Thread.sleep(3000);
		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		WebElement addPhNum = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/form/div/input"));
		addPhNum.sendKeys("(205) 642-09210");
		try {
			Thread.sleep(3000);
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
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
		  Select drpdwn=new Select(driver.findElement(By.xpath("//*[@id=\"IndependentPatientDetailGender\"]")));
		    drpdwn.selectByVisibleText("Male");
		    //drpdwn.selectByIndex(2);
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		   	

//		    WebElement emailss = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/div/form/div[3]/div[4]/input"));
//			  emailss.sendKeys("madihaiqbal523+20122@gmail.com");
//		    
		      driver.findElement(By.cssSelector("#IndependentPatient-form .btn-next-fn")).click();
		      
		      try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			   	
		      WebElement verificationMM = driver.findElement(By.id("VerificationMM"));
		      verificationMM.sendKeys("05");
		      
		      
		      
		      WebElement verificationDD = driver.findElement(By.id("VerificationDD"));
		      verificationDD.sendKeys("05");
		      
		     
		      WebElement verificationYYYY = driver.findElement(By.id("VerificationYYYY"));
		      verificationYYYY.sendKeys("1991");
		      
		      try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div/form/button")).click();

		      try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		      driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div/form/div[3]/ul/li/button")).click();
		      
		      
		      try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    
//		      
//		      WebElement xyz=driver.findElement(By.xpath("//*[@id=\"ProviderDetails-form\"]/div[3]/div/div/div/div[1]/span[1]"));
//		      
//
//		      xyz.click();
		      
		   
		      
		      WebElement countrydropdown=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[11]/div/form/div[3]/div/div/div/div[1]/span[1]"));
		      JavascriptExecutor jsee = (JavascriptExecutor) driver;  
		      jsee.executeScript("$(\"#QuestionnaireProviders\").select2('open'); $(\"#QuestionnaireProviders\").val($(\"#QuestionnaireProviders option:contains(Saqib Habib)\").val()).trigger('change'); $(\"#QuestionnaireProviders\").select2('close');");
//		      
		      
		      
		      
		      WebElement btnCont = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[11]/div/form/div[4]/div/button"));
		      btnCont.click();
		      WebElement insurance_yescheckbox = driver.findElement(By.xpath("//*[@id=\"Insurance-yes\"]"));
		      JavascriptExecutor yes_insu = (JavascriptExecutor) driver;  
		      yes_insu.executeScript("arguments[0].click();", insurance_yescheckbox);

		       
		      WebElement insurance_continuee = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[12]/div/form/div[4]/div/button"));
		      JavascriptExecutor cont_isu = (JavascriptExecutor) driver;  
		      cont_isu.executeScript("arguments[0].click();", insurance_continuee);

		      
		      WebElement copay = driver.findElement(By.xpath("//*[@id=\"zeroId\"]"));
		      JavascriptExecutor copays = (JavascriptExecutor) driver;  
		      copays.executeScript("arguments[0].click();", copay);
		      
		      
		      WebElement copay_cont = driver.findElement(By.xpath("//*[@id=\"copayButton\"]"));
		      //JavascriptExecutor copayscont = (JavascriptExecutor) driver;  
		      //copayscont.executeScript("arguments[0].click();", copay_cont);
		      //to do list add copay executer javva to add payment method screen
		      
		      
		      copay_cont.click();
		      //to do payment method cont
		      //below -> 
		      //->>>>>>
		      
//		      WebElement payment_cont = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[17]/div/div[4]/div/div/button"));
//		      JavascriptExecutor paymentscount = (JavascriptExecutor) driver;  
//		      paymentscount.executeScript("arguments[0].click();", payment_cont);
		      
		      //->>>>>Done till above
		      
		      //comment out 
		      
		      
		      //WebElement iframeMsg = driver.findElement(By.name("//*[@id=\"card-number-element\"]/div/iframe"));        
		      driver.switchTo().frame(0);
		      //driver.switchTo().defaultContent();
		      
		    //id of  AddPaymentMethodForm for css selector
		      //InputElement is-empty Input Input--empty
		      
		      
		      
		      
		      //InputElement
		      try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		      
		      
		      
		      
		      
		      
		      
		      
		      //card details commenting
		      
		      
		      
		      
		      
		      
		    
		      
				WebElement agreE_btn = driver.findElement(By.xpath("//*[@id=\"tab_0\"]/div[2]/div/div[2]/button"));
			      JavascriptExecutor agree_co = (JavascriptExecutor) driver;  
			      agree_co.executeScript("arguments[0].click();", agreE_btn);
			     
				//agreE_btn.click();
		     
		  
				

		  	//test ready for commit comit comit ready ready
	}
	
	
	
	}


