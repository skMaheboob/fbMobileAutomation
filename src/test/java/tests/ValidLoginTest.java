package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class ValidLoginTest extends BaseTest {
	    @Test
	    public void testValidLogin() throws InterruptedException {
	        LoginPage login = new LoginPage(driver);
	        login.login("8333069823", "Basha@1308");
	        System.out.println("✅ Login Successful");
	    }
	}


