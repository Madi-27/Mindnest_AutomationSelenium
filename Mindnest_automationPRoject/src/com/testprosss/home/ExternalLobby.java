package com.testprosss.home;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		addPhNum.sendKeys("(205) 558-5153");
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
		      WebElement providerdropdow = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[11]/div/form/div[3]/div/div/div/div[1]/span[1]/span[1]/span"));
		      providerdropdow.click();
		      
//		      WebElement providersearch = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		      providersearch.sendKeys("Saqib Habib");
//		      
//		      WebElement providerdropdowt = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[11]/div/form/div[3]/div/div/div/div[1]/span[1]/span[1]/span"));
//		      providerdropdowt.sendKeys("Saqib Habib");
		      
//		      String value = "Saqib Habib";
//		      WebElement dropdown = driver.findElement(By.xpath("/html/body/span/span/span[2]"));
//		      dropdown.click(); // assuming you have to click the "dropdown" to open it
//	      dropdown.findElement(By.cssSelector("select2-QuestionnaireProviders-result-awhs-53c9e14d-f6f1-4099-b318-defb47ff87d2")).click();
//	      
//		      
		      //String text = "Saqib Habib";
//		      WebElement el = driver.findElement(By.cssSelector(".select2-results__option"));
//		      
//		      el.click();
//		      
		     
		      
		      
		      
//try {
//	Thread.sleep(5000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
		      
		      
		      WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[11]/div/form/div[3]/div/div/div/div[1]/span[1]"));
		      dropdown.click(); // assuming you have to click the "dropdown" to open it
		      List<WebElement> options = dropdown.findElements(By.tagName("li"));
		      String searchText = "Saqib Habib";
		      for (WebElement option : options)
		      {
		          if (option.getText().equals(searchText))
		          {
		              option.click(); // click the desired option
		              break;
		          }
		      }
		    
		      
		      
		      
		      
		   // while the following loop runs, the DOM changes - 
		   // page is refreshed, or element is removed and re-added
		  
		      
		      
			  
		      
		      
		      
		      
		      
		      //scroll to views
//		      WebElement element = driver.findElement(By.xpath("//a[@href='itemDetail.php?id=19']"));    
//		      JavascriptExecutor js = (JavascriptExecutor) driver;  
//		      js.executeScript("arguments[0].scrollIntoView();",element);
//		      element.click();
		      
		      
		      
		      
		      
			
//			WebElement element = driver.findElement(By.id("SubmitButtonId"));
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);

		      
		      
	}
	
	
	
	}


