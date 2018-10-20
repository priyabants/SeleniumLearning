package pageActn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objrepository.Repo_PropDetails;
import glibrary.TstBase;
import glibrary.proprtyHelper;

public class A_PropertyDetails extends TstBase {

	@Test
	public void Property_Cover() throws IOException {
		
		System.out.println("inside Property_Cover");
		proprtyHelper pop = new proprtyHelper();
		/*Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\chethan\\eclipse-workspace\\Home\\src\\main\\java\\glibrary\\config.properties");
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("browser"));*/
		
		//String browser = prop.getProperty("browser");
		String browser = pop.getPropertyValue("browser");
		
		/*A_PropertyDetails pd = new A_PropertyDetails();
		
		driver = pd.InitializeDriver(browser);*/
/*		System.out.println(pop.getPropertyValue("URL_PropDetails"));
		driver.get(pop.getPropertyValue("URL_PropDetails"));*/
		
		Repo_PropDetails pdt = PageFactory.initElements(driver, Repo_PropDetails.class);
		
		waitUntill(pdt.Cover_Type);
		
		performClick(pdt.Cover_Type);
		selectDD(pdt.Property_Type,"02","value");
		setText(pdt.Year_built,"1970");
		selectDD(pdt.Number_Bedrooms,"2","value");
		selectDD(pdt.Number_Bathrooms,"2","value");
		performClick(pdt.contructionType_Yes);
		performClick(pdt.Ownership);
		selectDD(pdt.Property_UsedType,"PMH","value");
		performClick(pdt.flooding_No);
		selectDD(pdt.Audults,"2","value");
		selectDD(pdt.Children,"2","value");
		performClick(pdt.Years);
		performClick(pdt.unOccupiedDuringDay_Yes);
		performClick(pdt.IsJointPolicyHolder_No);
		performClick(pdt.claimsyears_none);
		//setText(pdt.CoverStart_Date,"08092018");
		performClick(pdt.Continue);
		
		
		
		
		
		
	}

	
}
