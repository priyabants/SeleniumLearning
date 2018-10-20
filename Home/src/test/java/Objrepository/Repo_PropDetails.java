package Objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repo_PropDetails {
	
	
	@FindBy(xpath="//li[@id='buildingsContentsSelector']/label")
	public WebElement Cover_Type;
	
	@FindBy(id="PropertyType")
	public WebElement Property_Type;
	
	@FindBy(id="YearBuilt")
	public WebElement Year_built;
	
	@FindBy(id="NumberOfBedrooms")
	public WebElement Number_Bedrooms;
	
	@FindBy(id="NumberOfBathrooms")
	public WebElement Number_Bathrooms;
	
	@FindBy(xpath= "//label[@for='constructionTypeYes']")
	public WebElement contructionType_Yes;
	
	@FindBy(name="WallConstruction")
	public WebElement Wall_construction;
	
	@FindBy(name="RoofConstruction")
	public WebElement Roof_Construction;
	
	@FindBy(xpath="//label[@for='ownership_O']")
	public WebElement Ownership;
	
	@FindBy(id="PropertyUsedType")
	public WebElement Property_UsedType;
	
	@FindBy(xpath="//label[@for='floodingNo']")
	public WebElement flooding_No;
	
	@FindBy(id="NumberOfAdults")
	public WebElement Audults;
	
	@FindBy(id="NumberOfChildren")
	public WebElement Children;
	
	@FindBy(xpath="//label[@for='years_5']")
	public WebElement Years;
	
	@FindBy(xpath="//label[@for='unOccupiedDuringDayYes']")
	public WebElement unOccupiedDuringDay_Yes;
	
	@FindBy(xpath="//div[@class='clearFix']/form/fieldset/div/div/div/table/tbody/tr[2]/td[7]/a")
	public WebElement CoverStart_Date;

	@FindBy(xpath="//label[@for='IsJointPolicyHolderNo']")
	public WebElement IsJointPolicyHolder_No;
	
	@FindBy(xpath="//label[@for='claimsyears_0']")
	public WebElement claimsyears_none;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement Continue;
}
