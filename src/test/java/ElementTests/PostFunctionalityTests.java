package ElementTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;

public class PostFunctionalityTests  extends BaseTest {

    @Test
    public void verifyPostButton() {
        WebElement postBtn = driver.findElement(AppiumBy.accessibilityId("Post"));
        Assert.assertTrue(postBtn.isDisplayed(), "Post button not visible");
    }

    @Test
   public void verifyNotificationTabClick() throws InterruptedException {
        WebElement notificationTab = driver.findElement(
            AppiumBy.xpath("//android.view.View[@content-desc='Notifications, tab 5 of 6']")
        );
        notificationTab.click();
        Thread.sleep(2000);
        // Add more verification here
    }
    
   

    
}


