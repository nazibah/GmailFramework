package Pages;

import GmailAPI.GmailCommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleApps extends GmailCommonAPI {

    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement loginUsername;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement loginPassword;
    @FindBy(xpath = "//*[@class='gb_kf']")
    public static WebElement googleAppsViewBox;
    @FindBy (xpath = "//*[@id='gb192']/span[1]")
    public static WebElement userAccount;
    @FindBy(xpath = "//a[@id='gb1']//span[@class='gb_W']")
    public static WebElement googleSearch;
    @FindBy(xpath = "//a[@id='gb8']//span[@class='gb_W']")
    public static WebElement googleMaps;
    @FindBy(xpath = "//a[@id='gb36']//span[@class='gb_W']")
    public static WebElement youTube;
    @FindBy(xpath = "//a[@id='gb78']//span[@class='gb_W']")
    public static WebElement playStore;
    @FindBy(xpath = "//a[@id='gb5']//span[@class='gb_W']")
    public static WebElement googleNews;
    @FindBy(xpath = "//a[@id='gb53']//span[@class='gb_W']")
    public static WebElement googleContacts;
    @FindBy(xpath = "//a[@id='gb49']//span[@class='gb_W']")
    public static WebElement googleDrive;
    @FindBy(xpath = "//a[@id='gb24']//span[@class='gb_W']")
    public static WebElement googleCalender;
    @FindBy(xpath = "//a[@id='gb119']//span[@class='gb_W']")
    public static WebElement googlePlus;
    @FindBy(xpath = "//a[@id='gb51']//span[@class='gb_W']")
    public static WebElement googleTranslate;
    @FindBy(xpath = "//a[@id='gb31']//span[@class='gb_W']")
    public static WebElement googlePhotos;

    public void ShowGoogleApps(){
        login();
        googleAppsViewBox.click();
    }

    public void ShowUserAccount(){
        ShowGoogleApps();
        userAccount.click();
    }
    public void ShowGoogleSearch(){
        ShowGoogleApps();
        googleSearch.click();
    }
    public void ShowGoogleMaps(){
        ShowGoogleApps();
        googleMaps.click();
    }
    public void ShowYouTube(){
        ShowGoogleApps();
        youTube.click();
    }
    public void ShowPlayStore(){
        ShowGoogleApps();
        playStore.click();
    }
    public void ShowGoogleNews(){
        ShowGoogleApps();
        googleNews.click();
    }
    public void ShowGoogleContacts(){
        ShowGoogleApps();
        googleContacts.click();
    }
    public void ShowGoogleDrive(){
        ShowGoogleApps();
        googleDrive.click();
    }
    public void ShowGoogleCalender(){
        ShowGoogleApps();
        googleCalender.click();
    }
    public void ShowGooglePlus(){
        ShowGoogleApps();
        googlePlus.click();
    }
    public void ShowGoogleTranslate(){
        ShowGoogleApps();
        googleTranslate.click();
    }
    public void ShowGooglePhotos(){
        ShowGoogleApps();
        googlePhotos.click();
    }
    public void login(){
        loginUsername.sendKeys("chocolategirl1995", Keys.ENTER);
        loginPassword.sendKeys("nazi1995", Keys.ENTER);
    }
}
