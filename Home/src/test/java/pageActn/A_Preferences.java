package pageActn;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objrepository.Repo_Preferences;
import glibrary.TstBase;
import glibrary.proprtyHelper;

public class A_Preferences extends TstBase {
	
	@Test
	public void Preference() throws IOException {
		
		proprtyHelper pp = new proprtyHelper();
		
		//String browser = pp.getPropertyValue("browser");
		
		Repo_Preferences prns = PageFactory.initElements(driver, Repo_Preferences.class);
		
		waitUntill(prns.Post_Label);
		performClick(prns.Post_Label);
		performClick(prns.Online_Only);
		//performClick(prns.Continue_Btn);
		performClick(prns.Assumptions_Wrong);
		
		
		
		
	}

}
