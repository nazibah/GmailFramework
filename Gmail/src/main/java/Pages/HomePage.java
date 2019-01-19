package Pages;

import GmailAPI.GmailCommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GmailCommonAPI {

    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement loginUsername;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement loginPassword;
    @FindBy(css = ".T-I.J-J5-Ji.T-I-KE.L3")
    public static WebElement composeButton;
    @FindBy(xpath = "//*[@id=':px']")
    public static WebElement recipientEmail;
    @FindBy(xpath = "//*[@id=':pf']")
    public static WebElement emailSubject;
    @FindBy(xpath = "//*[@id=':qk']")
    public static WebElement emailBody;
    @FindBy(xpath = "//*[@id=':p5']")
    public static WebElement sendButton;
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement helpOption;
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
    @FindBy (xpath = "//div[contains(text(),'Get started')]")
    public static WebElement getstarted;
    @FindBy(xpath = "//div[@id=':28']//div[@class='asa']")
    public static WebElement emailSettings;
    @FindBy(xpath = "//div[contains(text(),'Themes')]")
    public static WebElement settingsThemes;
    @FindBy (xpath = "//div[@id=':k6']")
    public static  WebElement olderMessages;
    @FindBy (xpath = "/html/body/div[2]/header/div[4]/div/div/div/div/span/a/span")
    public static WebElement googleAccount;
    @FindBy (xpath = "//a[contains(text(),'Terms')]")
    public static WebElement terms;
    @FindBy(xpath = "//*[@id=\"initialView\"]/footer/ul/li[2]/a")
    public static WebElement privacy;
    @FindBy(xpath = "//div[contains(text(),'Display density')]")
    public static WebElement displayDensity;
    @FindBy(xpath = "//input[@placeholder='Search mail']")
    public static WebElement searchMail;
    @FindBy (xpath = "//*[@id=\":n3\"]/span")
    public static WebElement searchEmailResult;
    @FindBy(xpath = "//*[@id=\":159\"]")
    public static WebElement emailReply;
    @FindBy (xpath = "//*[@id=\":1a4\"]")
    public static WebElement replyEmailBody;
    @FindBy (xpath = "//*[@id=\":18p\"]")
    public static WebElement replyEmailSendButton;

    public void searchEmail(){
        login();
        searchMail.sendKeys("naz", Keys.ENTER);
        searchEmailResult.click();
        emailReply.click();
        replyEmailBody.sendKeys("wuv you");
        replyEmailSendButton.click();
    }
    public void term(){
        terms.click();
    }
    public void login(){
        loginUsername.sendKeys("chocolategirl1995", Keys.ENTER);
        loginPassword.sendKeys("nazi1995", Keys.ENTER);
    }
    public void sendEmailCompose(){
        login();
        composeButton.click();
    }
    public void sendEmailRecipientEmail(){
        sendEmailCompose();
        recipientEmail.sendKeys("chocolategirl1995@gmail.com", Keys.ENTER);
    }
    public void sendEmailemailSubject(){
        sendEmailRecipientEmail();
        emailSubject.sendKeys("Hey");
    }
    public void sendEmailemailBody(){
        sendEmailemailSubject();
        emailBody.sendKeys("Naz");
    }
    public void sendEmailSendButton() throws InterruptedException {
        sendEmailemailBody();
        sendButton.click();
        Thread.sleep(3000);
    }
    public void sendEmail() throws InterruptedException {
        login();
        composeButton.click();
        recipientEmail.sendKeys("chocolategirl1995@gmail.com", Keys.ENTER);
        emailSubject.sendKeys("Hey");
        emailBody.sendKeys("Naz");
        sendButton.click();
        Thread.sleep(3000);
    }
    public void helpGoogleAccount(){
        helpOption.click();
        googleAccount.click();
    }
    public void GoogleApps() {
        login();
        googleAppsViewBox.click();
        userAccount.click();
        getstarted.click();
    }
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
    public void EmailSettings(){
        login();
        emailSettings.click();
    }
    public void EmailSettingsThemes(){
        login();
        emailSettings.click();
        settingsThemes.click();
    }
    public void EmailSettingsDisplayDensity(){
        login();
        emailSettings.click();
        displayDensity.click();
    }
    public void EmailOlderMessages(){
        login();
        olderMessages.click();
    }
    public void GoogleAppsViewBox(){
        login();
        googleAppsViewBox.click();
    }
    public void privacy(){
        privacy.click();
    }
}