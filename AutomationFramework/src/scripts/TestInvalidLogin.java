package scripts;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() throws InterruptedException 
	{
		LoginPage login=new LoginPage(driver);

	for(int i=1;i<=Lib.getTotalRowcount("InvalidLogin");i++) 
	{
			//enter username-admin
	String username=Lib.getCellValue("InvalidLogin", i, 0);
	login.setUsername(username);
	//Thread.sleep(3000);
	//enter the password-manager
	String password=Lib.getCellValue("InvalidLogin", i, 1);
	login.setPassword(password);
	//Thread.sleep(1000);
	//click on Login
	login.clickLogin();
	Thread.sleep(3000);
		}
	}

}
