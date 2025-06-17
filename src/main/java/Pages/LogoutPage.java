package Pages;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LogoutPage {
	private AndroidDriver driver;

	public LogoutPage(AndroidDriver driver) {
		this.driver = driver;
	}

	public void logout() throws InterruptedException {

		WebDriverWait LOGOUTTAB = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = (WebElement) LOGOUTTAB
				.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Menu, tab 6 of 6")));
		element.click();

		Dimension size = driver.manage().window().getSize();

		int startX = size.width / 2;
		int startY = (int) (size.height * 0.3);
		int endY = (int) (size.height * 0.8);

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(800), PointerInput.Origin.viewport(), startX, endY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
		WebElement logoutBtn = driver
				.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().description(\"Log out\"))"));
		logoutBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement element1 = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"LOG OUT\")")));
		element1.click();

	}
}
