package glibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TstBase {

	public static WebDriver driver;
	
	public WebDriver InitializeDriver(String browser) {		
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chethan\\Desktop\\SeleniumTest\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\chethan\\Desktop\\SeleniumTest\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	public void setText(WebElement obj, String value) {
		
		obj.clear();
		obj.sendKeys(value);
		
	}
	
	public void performClick(WebElement obj) {
		obj.click();		
	}
	
	public void selectDD(WebElement obj,String value,String type) {
		
		Select s=new Select(obj);
		if(type.equals("text"))
		{
			s.selectByVisibleText(value);
		}
		else if(type.equals("value"))
		{
			s.selectByValue(value);
		}
		else if(type.equals("index"))
		{
			s.selectByIndex(Integer.parseInt(value));
		}
	}
	
	public void waitUntill(WebElement obj) {
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(obj));
		
	}
	
	public void CaptureScreenshot(String name) throws IOException {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(SrcFile, new File("C:\\Users\\chethan\\eclipse-workspace\\MavenTest\\Screenshot\\"+name+".png"));
	}
	
	public void forceClick(WebElement obj) {
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", obj);
	}
}
