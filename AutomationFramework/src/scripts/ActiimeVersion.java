package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.ActitimePage;
import pompages.LoginPage;


@Test
public class ActiimeVersion extends BaseTest {
	public void testActitimePage() throws Exception {
		LoginPage login=new LoginPage(driver);
		ActitimePage act=new ActitimePage(driver);
		String username=Lib.getCellValue("ValidLogin", 1, 0);
		login.setUsername(username);
		//enter the password-manager
		String password=Lib.getCellValue("ValidLogin", 1, 1);
		login.setPassword(password);
		//click on Login
		login.clickLogin();
		Thread.sleep(3000);
		//ActitimePage act=new ActitimePage(driver);
		//click for helpbutton
		act.clickHelpButton();
		//click for about button
		act.aboutButton();
		//click for aboutlink
		act.actitimeLink();
		//get the text
		String actualText=act.actitimeLink();

		System.out.println(actualText);	
		//String excepted=
		//Assert.assertEquals(actualText, "2", "page name incorrect");


	}
}