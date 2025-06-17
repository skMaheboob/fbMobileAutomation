package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class PostPage {
	private AndroidDriver driver;

    public PostPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void uploadPost(String message) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select photos or videos for your post\"]")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Photo taken\")")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(7)")).click();
        driver.findElement(AppiumBy.className("android.widget.AutoCompleteTextView")).sendKeys(message);
        driver.findElement(AppiumBy.accessibilityId("POST")).click();
    }

	

}
