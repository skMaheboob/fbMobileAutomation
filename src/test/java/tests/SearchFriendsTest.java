package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SearchPage;

public class SearchFriendsTest  extends BaseTest{
	  @Test
	    public void testSearchFriends() throws InterruptedException {
	     //   LoginPage login = new LoginPage(driver);
	     //   login.login("8333069823", "Basha@1308");

	        SearchPage search = new SearchPage(driver);
	        search.searchfriends("Rahul");
	        System.out.println("✅ Friend Search Successful");
	    }

}
