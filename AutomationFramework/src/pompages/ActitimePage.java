package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseTest;

public class ActitimePage  extends BaseTest{
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	WebElement helpbtn;
	@FindBy(xpath="//a[text()='About your actiTIME']")
	WebElement aboutActitime;
	@FindBy(xpath="//span[text()='actiTIME 2019.2 Pro']")
	WebElement actitimeLink;
	@FindBy(id="aboutPopupCloseButtonId")
	WebElement cancelpopup;

	//initilization
	public ActitimePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void clickHelpButton() {
		helpbtn.click();
	}
	public void aboutButton() {
		aboutActitime.click();
	}
	public String actitimeLink() {
		String text = actitimeLink.getText();
		return text;
	}
	public void cancelPopup() {
		cancelpopup.click();
	}

}


