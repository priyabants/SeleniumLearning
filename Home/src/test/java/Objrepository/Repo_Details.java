package Objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repo_Details {

	
	@FindBy(id="PolicyHolder_Title")
	public WebElement  Holder_Title;
	
	@FindBy(id="PolicyHolder_FirstName")
	public WebElement First_Name;
	
	@FindBy(id="PolicyHolder_LastName")
	public WebElement Last_Name;
	
	@FindBy(id="PolicyHolder_DateOfBirth")
	public WebElement DateOfBirth;
	
	@FindBy(id="PropertyToInsure_Postcode")
	public WebElement Post_Code;
	
	@FindBy(id="addressLookup")
	public WebElement Find_Address;
	
	//able to do Radio button option
	@FindBy(xpath = "//label[contains(text(),\"Yes\")]")
	public WebElement Correspondence_Address_Yes;
	
	@FindBy(xpath = "//label[contains(text(),\"No\")]")
	public WebElement Correspondence_Address_No;
	
	@FindBy(name = "continueButton")
	public WebElement Continue_Button;
	
	@FindBy(id="PropertyToInsure_MultiplePostcode")
	public WebElement Multiple_postCode;
	
	@FindBy(id="PolicyHolder_EmailAddress")
	public WebElement Email_Address;
	
	@FindBy(id="PolicyHolder_TelephoneNumber")
	public WebElement Phone_Number;
	
	
}
