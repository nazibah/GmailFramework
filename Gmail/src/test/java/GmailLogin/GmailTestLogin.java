package GmailLogin;

import org.testng.annotations.Test;

public class GmailTestLogin extends GmailLoginPage {
    @Test
    public void test1() { login(); }
    @Test
    public void test4() throws InterruptedException {composeMail(); }
    @Test
    public void test2(){
        clickCreateAccount();
    }
    @Test
    public void test3(){
        createAccountFirstName();
    }
    @Test
    public void test7(){
        createAccountLastName();
    }
    @Test
    public void test8(){ createAccountUserName(); }
    @Test
    public void test9() {
        createAccountPassword();
    }
    @Test
    public void test10() {
        createAccountConfirmPassword();
    }
    @Test
    public void test5(){
        googleApps();
    }
}

