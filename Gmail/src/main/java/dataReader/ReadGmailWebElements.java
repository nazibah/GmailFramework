package dataReader;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reader.Readxls;
import java.util.ArrayList;
import java.util.List;

public class ReadGmailWebElements extends CommonApi {
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    WebElement help;
    @FindBy(xpath = "//a[contains(text(),'Privacy')]")
    WebElement privacy;
    @FindBy (xpath = "//a[contains(text(),'Terms')]")
    WebElement terms;

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(help);
        webElements.add(privacy);
        webElements.add(terms);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
    Readxls xlData = new Readxls("/Users/nazibahfariha/Downloads/TeamAutomation2018-master/Gmail/Data/Gmail.xlsx");

    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("HelpOptions");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("HelpOptions","HelpOptions",i));
        }
        System.out.println(expect);
        return expect;
    }

}