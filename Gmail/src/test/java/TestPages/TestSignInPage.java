package TestPages;

import Pages.CreateAccount;
import Pages.SignInPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestSignInPage extends CommonApi {
    SignInPage signInPage;

    @BeforeMethod
    public void setUp() {
        signInPage = PageFactory.initElements(driver, SignInPage.class);}

    @Test
    public void SignInPage() {
        List actual = signInPage.SignInPage();
        List expected = signInPage.SignInPageExpected();
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void logoDisplayTest(){
        boolean display = signInPage.gLogo();
        Assert.assertTrue (display);
    }

    @Test
    public void logoEnabled(){
        boolean actual = signInPage.logoEnabled ();
        Assert.assertTrue (actual);
    }
}
