package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.PostPage;

public class ImagePostTest extends BaseTest {
    @Test
    public void testImagePost() throws InterruptedException {
      //  LoginPage login = new LoginPage(driver);
      // login.login("8333069823", "Basha@1308");

        PostPage post = new PostPage(driver);
        post.uploadPost("Ill Drive you all crazy");
        System.out.println("✅ Post Uploaded Successfully");
    }
}


