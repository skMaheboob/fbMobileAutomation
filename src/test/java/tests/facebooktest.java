package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.NotificationsPage;
import Pages.PostPage;
import Pages.PostaComment;
import Pages.SearchPage;

public class facebooktest extends BaseTest {
	  @Test
	    public void facebookflow() throws InterruptedException {
		  
		    System.out.println("Application Started");
	        LoginPage login = new LoginPage(driver);
	        login.login("8333069823", "Basha@1308");
	        System.out.println("Login Succeesful");
	        
	        
	        
	        PostaComment text=new PostaComment(driver);
	        text.postcomment("I am coming to Conquer the World ");
	        System.out.println("Comments Passsed");
	        
	        

	        PostPage post = new PostPage(driver);
	        post.uploadPost("Im Coming");
	        System.out.println("Post Successfull");
	        
	        
	        NotificationsPage notification =new NotificationsPage(driver);
	        notification.Notifications();
	        System.out.println("Notifications Checked");
	        
	        
	        SearchPage search=new SearchPage(driver);
	        search. searchfriends("Rahul");
	        System.out.println("Search Successful");
	        
	        PostaComment comment=new PostaComment(driver);
	        comment.postcomment("ILL COME BACK ");
	     
	   

	        LogoutPage logout = new LogoutPage(driver);
	        logout.logout();
	        System.out.println("Logout Success");

	  }

}
