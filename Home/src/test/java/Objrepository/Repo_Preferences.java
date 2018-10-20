package Objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repo_Preferences {
	
	@FindBy(id="DeclineContactByPostLabel")
	public WebElement Post_Label;
	
	@FindBy(xpath="//label[@for='onlineOnly']")
	public WebElement Online_Only;
	
	/*@FindBy(id="continueBtn")
	public WebElement Continue_Btn;
	*/
	@FindBy(xpath="//input[@name='assumptionsWrong']")
	public WebElement Assumptions_Wrong;

}
