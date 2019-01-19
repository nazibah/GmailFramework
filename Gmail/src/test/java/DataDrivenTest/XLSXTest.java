package DataDrivenTest;

import base.CommonApi;
import dataReader.ReadGmailWebElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XLSXTest extends CommonApi {

    ReadGmailWebElements readGmailWebElements;

    @BeforeMethod
    public void setUP(){
        readGmailWebElements = PageFactory.initElements(driver,ReadGmailWebElements.class);

    }
    @Test
    public void webElementName(){   // data driven test, using data from excel sheets
        List actual = readGmailWebElements.webElementList();
        List expected = readGmailWebElements.expectedWebElement();
        Assert.assertEquals(actual,expected);

    }
}