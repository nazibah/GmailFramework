package Pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class SignInPage extends CommonApi {
    @FindBy(xpath = "//*[@viewBox='0 0 74 37']")
    WebElement logo;
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    WebElement help;
    @FindBy(xpath = "//a[contains(text(),'Privacy')]")
    WebElement privacy;
    @FindBy (xpath = "//a[contains(text(),'Terms')]")
    WebElement terms;
    @FindBy(xpath = "//span[contains(text(),'Create account')]")
    WebElement createAccount;
    @FindBy(xpath = "//button[@type='button']")
    WebElement forgotEmail;
    @FindBy(xpath = "//a[contains(text(),'Learn more')]")
    WebElement learnMore;
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement Next;

    public List SignInPage() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(help);
        webElements.add(privacy);
        webElements.add(terms);
        webElements.add(createAccount);
        webElements.add(forgotEmail);
        webElements.add(learnMore);
        webElements.add(Next);

        List<String> list = new ArrayList<>();
        for (int i =0; i<webElements.size(); i++){
            list.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText());
        }
        return list;
    }
    public List SignInPageExpected(){
        List<String> expected = new ArrayList<>();
        expected.add("Help");
        expected.add("Privacy");
        expected.add("Terms");
        expected.add("Create account");
        expected.add("Forgot email?");
        expected.add("Learn more");
        expected.add("Next");
        return expected;
    }

    public boolean gLogo(){
        boolean display = logo.isDisplayed();
        return display;
    }
    public boolean logoEnabled(){
        boolean enabled = logo.isEnabled ();
        return enabled;
    }

}
