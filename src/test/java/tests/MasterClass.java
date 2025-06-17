package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.NotificationsPage;
import Pages.PostPage;
import Pages.PostaComment;
import Pages.Profilepage;
import Pages.SearchPage;


public class MasterClass extends BaseTest {
	@Test(priority = 1, description = " Login the Device ")
	public void loginTest() throws InterruptedException {
		System.out.println("🔁 Application Started");

		LoginPage login = new LoginPage(driver);
		login.login("8333069823", "Basha@1308");

	}

	@Test(priority = 2, description = "Posting Comments ")
	public void postComment1() throws InterruptedException {
		PostaComment comment = new PostaComment(driver);
		comment.postcomment("I am coming to Conquer the World");
		System.out.println("Posting Comments Done");

	}

	@Test(priority = 3, description = "Posting Image")
	public void postStatus() throws InterruptedException {
		PostPage post = new PostPage(driver);
		post.uploadPost("When the stache is small but the ego invades countries");
		System.out.println("Posting Image Done -");

	}

	@Test(priority = 4, description = "Checking Notifications")
	public void checkNotifications() throws InterruptedException {
		NotificationsPage notification = new NotificationsPage(driver);
		notification.Notifications();
		System.out.println("Notificatiosn Checked");

	}

	@Test(priority = 5, description = "Search For Friends")
	public void searchFriend() throws InterruptedException {
		SearchPage search = new SearchPage(driver);
		search.searchfriends("Rahul");
		System.out.println("Searching Friends Done");
	}

	@Test(priority = 6, description = " Update the Profile picture")
	public void UpdateProfile() throws InterruptedException {
		Profilepage update = new Profilepage(driver);
		update.updatepic();
		System.out.println("Profile pic updated");

	}

	
	

	@Test(priority = 7, description = "Logout from the Device")
	public void logoutTest() throws InterruptedException {
		LogoutPage logout = new LogoutPage(driver);
		logout.logout();
		System.out.println("Logout  Done");

	}

}
