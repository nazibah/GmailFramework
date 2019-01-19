package TestPages;

import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage homepage;
    @BeforeMethod
    public void initializeElement(){ homepage = PageFactory.initElements(driver,HomePage.class); }

    @Test
    public void gmailLogin(){homepage.login(); }
    @Test
    public void Email() throws InterruptedException {homepage.sendEmail();}
    @Test
    public void TestEmailSettings (){homepage.EmailSettings();}
    @Test
    public void TestSendEmailCompose (){homepage.sendEmailCompose();}
    @Test
    public void TestSendEmailRecipientEmail(){homepage.sendEmailRecipientEmail();}
    @Test
    public void TestSendEmailemailSubject(){homepage.sendEmailemailSubject();}
    @Test
    public void TestSendEmailemailBody(){homepage.sendEmailemailBody();}
    @Test
    public void TestSendEmailSendButton() throws InterruptedException {homepage.sendEmailSendButton();}
    @Test
    public void TestEmailOlderMessages(){homepage.EmailOlderMessages();}
    @Test
    public void TestGoogleAppsViewBox(){homepage.GoogleAppsViewBox();}
    @Test
    public void TestGoogleApps(){homepage.GoogleApps();}
    @Test
    public void TestShowGoogleApps(){homepage.ShowGoogleApps();}
    @Test
    public void TestShowUserAccount(){homepage.ShowUserAccount();}
    @Test
    public void TestShowGoogleSearch(){homepage.ShowGoogleSearch();}
    @Test
    public void TestShowGoogleMaps(){homepage.ShowGoogleMaps();}
    @Test
    public void TestShowYouTube(){homepage.ShowYouTube();}
    @Test
    public void TestShowPlayStore(){homepage.ShowPlayStore();}
    @Test
    public void TestShowGoogleNews(){homepage.ShowGoogleNews();}
    @Test
    public void TestShowGoogleContacts(){homepage.ShowGoogleContacts();}
    @Test
    public void TestShowGoogleDrive(){homepage.ShowGoogleDrive();}
    @Test
    public void TestShowGoogleCalender(){homepage.ShowGoogleCalender();}
    @Test
    public void TestShowGooglePlus(){homepage.ShowGooglePlus();}
    @Test
    public void TestShowGoogleTranslate(){homepage.ShowGoogleTranslate();}
    @Test
    public void TestShowGooglePhotos(){homepage.ShowGooglePhotos();}
    @Test
    public void TestEmailSettingsDisplayDensity(){homepage.EmailSettingsDisplayDensity();}
    @Test
    public void TestPrivacy (){homepage.privacy();}
    @Test
    public void TestSearchEmail(){homepage.searchEmail();}//works
    @Test
    public void TestTerm (){homepage.term();}
    @Test
    public void Test(){homepage.EmailSettingsThemes();}
}



















