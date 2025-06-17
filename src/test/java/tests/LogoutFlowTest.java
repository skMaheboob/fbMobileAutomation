package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.LogoutPage;

public class LogoutFlowTest extends BaseTest {
	@Test
    public void testLogout() throws InterruptedException {
      //  LoginPage login = new LoginPage(driver);
    //    login.login("8333069823", "Basha@1308");

        LogoutPage logout = new LogoutPage(driver);
        logout.logout();
        System.out.println("✅ Logout Successful");
    }

}
