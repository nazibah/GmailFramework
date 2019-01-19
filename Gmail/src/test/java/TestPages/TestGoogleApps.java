package TestPages;

import Pages.GoogleApps;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGoogleApps extends GoogleApps {

    GoogleApps googleApps;

    @BeforeMethod
    public void initializeElement(){ googleApps = PageFactory.initElements(driver,GoogleApps.class); }

    @Test
    public void TestShowGoogleApps(){ googleApps.ShowGoogleApps();}
    @Test
    public void TestShowUserAccount(){googleApps.ShowUserAccount();}
    @Test
    public void TestShowGoogleSearch(){googleApps.ShowGoogleSearch();}
    @Test
    public void TestShowGoogleMaps(){googleApps.ShowGoogleMaps();}
    @Test
    public void TestShowYouTube(){googleApps.ShowYouTube();}
    @Test
    public void TestShowPlayStore(){googleApps.ShowPlayStore();}
    @Test
    public void TestShowGoogleNews(){googleApps.ShowGoogleNews();}
    @Test
    public void TestShowGoogleContacts(){googleApps.ShowGoogleContacts();}
    @Test
    public void TestShowGoogleDrive(){googleApps.ShowGoogleDrive();}
    @Test
    public void TestShowGoogleCalender(){googleApps.ShowGoogleCalender();}
    @Test
    public void TestShowGooglePlus(){googleApps.ShowGooglePlus();}
    @Test
    public void TestShowGoogleTranslate(){googleApps.ShowGoogleTranslate();}
    @Test
    public void TestShowGooglePhotos(){googleApps.ShowGooglePhotos();}
}
