package Pages;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class CreateAccount extends CommonApi {
    @FindBy(xpath = "//span[contains(text(),'Create account')]")
    WebElement createAccount;
    @FindBy(xpath = "//div[@class='m6Azde DbQnIe OcVpRe']//div[1]//div[1]//div[2]//div[2]//div[1]")
    WebElement firstNameErrorMessage;
    @FindBy(xpath = "//div[@class='m6Azde DbQnIe OcVpRe']//div[2]//div[1]//div[2]//div[2]//div[1]")
    WebElement lastNameErrorMessage;
    @FindBy(xpath = "//*[@id='view_container']/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div")
    WebElement usernameErrorMessage;
    @FindBy(xpath = "//span[@class='RveJvd snByac']")
    WebElement nextSumbit;
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameInput;
    @FindBy(xpath = "//*[@id='firstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastNameInput;
    @FindBy (xpath = "//input[@name='ConfirmPasswd']")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//div[@class='GQ8Pzc']")
    WebElement invalidEmailErrorMessage;
    @FindBy(xpath = "//input[@name='Passwd']")
    WebElement passwordInput;
    @FindBy(xpath ="//div[@class='GQ8Pzc']")
    WebElement invalidConfirmPasswordInput;
    @FindBy(xpath = "//div[@id='passwd']//div[@class='GQ8Pzc']")
    WebElement invalidPasswordErrorMessage;
    @FindBy(xpath = "//div[@id='passwd']//div[@class='GQ8Pzc']")
    WebElement passwordErrorMessage;
    @FindBy(xpath = "//div[@class='GQ8Pzc']")
    WebElement confirmEmailErrorMessage;

    public List WithoutInfo() {
        List<String> list = new ArrayList<>();
        createAccount.click();
        nextSumbit.click();
        list.add(firstNameErrorMessage.getText());
        System.out.println(firstNameErrorMessage.getText());
        list.add(lastNameErrorMessage.getText());
        System.out.println(lastNameErrorMessage.getText());
        list.add(usernameErrorMessage.getText());
        System.out.println(usernameErrorMessage.getText());
        list.add(passwordErrorMessage.getText());
        System.out.println(passwordErrorMessage.getText());
        return list;
    }

    public List expectedMessagewithoutInfo() {
        List<String> list = new ArrayList<>();
        list.add("Enter first name");
        list.add("Enter last name");
        list.add("Choose a Gmail address");
        list.add("Enter a password");
        return list;
    }

    public String invalidPasswordSignUp() {
        createAccount.click();
        passwordInput.sendKeys("oooo");
        nextSumbit.click();
        String text = invalidPasswordErrorMessage.getText();
        return text;
    }

    public String invalidEmailSignUp() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("$$$$$$");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibahfariha");
        nextSumbit.click();
        String text = invalidEmailErrorMessage.getText();
        return text;
    }
    public String existingEmailSignUp() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("Nazibah95");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibahfariha");
        nextSumbit.click();
        String text = invalidEmailErrorMessage.getText();
        return text;
    }
    public String invalidConfirmPasswordInput() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("Nazibah95");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibah");
        nextSumbit.click();
        String text = invalidConfirmPasswordInput.getText();
        return text;
    }
    public String missingLastNameSignUP() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        usernameInput.sendKeys("Nazibah95");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibah");
        nextSumbit.click();
        String text = lastNameErrorMessage.getText();
        return text;
    }
    public String missingFirstNameSignUP() {
        createAccount.click();
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("Nazibah95");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibah");
        nextSumbit.click();
        String text = firstNameErrorMessage.getText();
        return text;
    }
    public String missingUserNameSignUP() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        passwordInput.sendKeys("nazibahfariha");
        confirmPasswordInput.sendKeys("nazibah");
        nextSumbit.click();
        String text = usernameErrorMessage.getText();
        return text;
    }
    public String missingPasswordSignUP() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("Nazibah95");
        confirmPasswordInput.sendKeys("nazibah");
        nextSumbit.click();
        String text = passwordErrorMessage.getText();
        return text;
    }
    public String missingConfirmPasswordSignUP() {
        createAccount.click();
        firstNameInput.sendKeys("Naz");
        lastNameInput.sendKeys("Far");
        usernameInput.sendKeys("Nazibah95");
        passwordInput.sendKeys("nazibahfariha");
        nextSumbit.click();
        String text = confirmEmailErrorMessage.getText();
        return text;
    }
}