package scripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws InterruptedException {
		//enter user name-admin
		LoginPage login=new LoginPage(driver);
		Thread.sleep(2000);
		String username=Lib.getCellValue("ValidLogin", 1, 0);
		Thread.sleep(2000);
		login.setUsername(username);
		//enter the password-manager
		String password=Lib.getCellValue("ValidLogin", 1, 1);
		Thread.sleep(2000);
		login.setPassword(password);
		//click on Login
		login.clickLogin();
		Thread.sleep(3000);


		//Assert.fail();
	/*	String HomePageTitle=driver.getTitle();
		if(HomePageTitle.equals("wrong page")) {
			System.out.println("loign succesfull");
		}else {
			System.out.println("login failed");
		}*/

	}

}
