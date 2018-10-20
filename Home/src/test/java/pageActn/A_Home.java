package pageActn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objrepository.Repo_Details;
import glibrary.TstBase;


@Test
public class A_Home extends TstBase {
	
	public void Launch() throws IOException, InterruptedException {
		
		System.out.println("inside Launch");
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\chethan\\eclipse-workspace\\Home\\src\\main\\java\\glibrary\\config.properties");
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("browser"));
		
		String browser = prop.getProperty("browser");
		
		A_Home hm = new A_Home();
		
		driver = hm.InitializeDriver(browser);
		System.out.println(prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		Repo_Details ah = PageFactory.initElements(driver, Repo_Details.class);
		
		//ah.Holder_Title.sendKeys("Thulasi");
		
		selectDD(ah.Holder_Title,"Mr","text");
		
//		ah.First_Name.sendKeys("Thulasi");
//		ah.Last_Name.sendKeys("Kumar");
//		ah.DateOfBirth.sendKeys("04/09/1981");
//		ah.Post_Code.sendKeys("nr1 3ns");
//		ah.Continue_Button.click();
//		
		setText(ah.First_Name,"FirstName");
		setText(ah.Last_Name,"LastName");
		setText(ah.DateOfBirth,"04091991");
		setText(ah.Post_Code,"nr1 3ns");
		
		performClick(ah.Find_Address);
		
		waitUntill(ah.Multiple_postCode);
		
		selectDD(ah.Multiple_postCode,"1","index");
		
		//driver.findElement(By.))
		

		
		performClick(ah.Correspondence_Address_No);
		
		
		/*if(correspAdrs.equals("yes")) {
			//write codde for post code
			//write code for click find address
			//waituntill dropdown
			//selec dropdown
		}*/
		
		
		setText(ah.Email_Address,"abc.text@gmail.com");
		setText(ah.Phone_Number,"7999999999");
		Thread.sleep(3000);
		performClick(ah.Continue_Button);
		
		//*************************************
		boolean flag=true;
		if(driver.findElement(By.className("loginError")).isDisplayed()) {
			System.out.println("invalid credential");
			flag=false;
		}
		/*else {
			//positive scenario here
		}*/
		
		if(flag==true) {
			//positive scenario
		}
		
		
		}		
		
	}
	
