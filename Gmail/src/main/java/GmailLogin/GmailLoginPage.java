package GmailLogin;
import GmailAPI.GmailCommonAPI;

public class GmailLoginPage extends GmailCommonAPI {
    public void login(){
        typeOnElementEntry("//*[@id='identifierId']", "chocolategirl1995");
        typeOnElementEntry("password", "nazi1995");
    }

    public void clickCreateAccount(){
        selectElementOnxpath("//span[contains(text(),'Create account')]");
    }

    public void createAccountFirstName(){
        clickCreateAccount();
        typeOnElement("firstName","naz");
    }

    public void createAccountLastName(){
        createAccountFirstName();
        typeOnElement("lastName","far");
    }

    public void createAccountUserName(){
        createAccountLastName();
        typeOnElement("Username","naz11211995");
    }

    public void createAccountPassword(){
        createAccountUserName();
        typeOnElement("password","naz");
    }

    public void createAccountConfirmPassword(){
        createAccountPassword();
        typeOnElement("//input[@name='ConfirmPasswd']","naz");
    }

    public void composeMail() throws InterruptedException {
        login();
        getEelementsByCss(".T-I.J-J5-Ji.T-I-KE.L3");
        typeByXpath("//*[@id=':px']","chocolategirl1995@gmail.com");
        typeByXpath("//*[@id=':pf']","naz");
        typeByXpath("//*[@id=':qk']","Hey");
        getEelementsByxpath("//*[@id=':p5']");
        Thread.sleep(3000);
    }

    public void googleApps(){
        login();
        selectElementOnclass("gb_mf");
        getEelementsByxpath("//*[@id='gb192']/span[1]");
    }
}