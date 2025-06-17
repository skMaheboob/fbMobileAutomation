package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.PostaComment;

public class CommentTest extends BaseTest{
	
	
    @Test
	public void comment() throws InterruptedException {
		
		//LoginPage login = new LoginPage(driver);
      //  login.login("8333069823", "Basha@1308");
        
        
        PostaComment text=new PostaComment(driver);
        text.postcomment("I am coming to Conquer the World ");
		
		
		
		
    }
}
