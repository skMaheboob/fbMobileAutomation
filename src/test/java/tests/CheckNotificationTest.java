package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.NotificationsPage;

public class CheckNotificationTest extends BaseTest {
	@Test
    public void testCheckNotifications() throws InterruptedException {
       // LoginPage login = new LoginPage(driver);
      //  login.login("8333069823", "Basha@1308");

        NotificationsPage notification = new NotificationsPage(driver);
        notification.Notifications();
        System.out.println("✅ Notifications Checked");
	}

}
