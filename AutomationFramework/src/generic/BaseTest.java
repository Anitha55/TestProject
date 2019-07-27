package generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
  public static WebDriver driver;
  static {
	  //set the path of all three browser drivers executables
	  System.setProperty(GECKO_KEY,GECKO_PATH);
	  System.setProperty(CHROME_KEY, CHROME_PATH);
	  System.setProperty(IE_KEY, IE_PATH);
	  } 
  @BeforeMethod
  public void openApplication() {
	  //launch the browser
	  driver=new ChromeDriver();
	  //enter the Url
	  driver.get(Lib.getPropertyValue("URL"));
	  String timeout=Lib.getPropertyValue("IMPLICIT_TIMEOUT");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //  WebDriverWait wait =new WebDriverWait(driver,10);
	 // wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
	  
  }
  @AfterMethod
  public void closeApplication(ITestResult res) {
	  //capture screen shot for only failed scripts
	  if(ITestResult.FAILURE==res.getStatus()) {
		  System.out.println(res.getStatus());
	  Lib.captureScreenshot(driver, res.getName());
	  }
	  //close the browser
	  driver.close();
  }
  
}
