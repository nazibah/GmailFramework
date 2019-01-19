package GmailAPI;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GmailCommonAPI extends CommonApi {
    @BeforeMethod
    public  void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        System.out.println("Opening the browser : Chrome");
    }
    @AfterMethod
    public void tearDownTest() {

        System.out.println("Closing the browser : Chrome");
    }

    public void brokenLink() throws IOException {
        //Step:1-->Get the list of all the links and images
        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        linkslist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total number of links and images--------->>> "+ linkslist.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        //Step:2-->Iterate linksList: exclude all links/images which does not have any href attribute
        for(int i=0; i<linkslist.size(); i++){
            System.out.println(linkslist.get(i).getAttribute("href"));
            if(linkslist.get(i).getAttribute("href") !=null && ( ! linkslist.get(i).getAttribute("href").contains("javascript") && ( ! linkslist.get(i).getAttribute("href").contains("mailto")))){
                activeLinks.add(linkslist.get(i));
            }

        }

        System.out.println("Total number of active links and images-------->>> "+ activeLinks.size());

        //Step:3--> Check the href url, with http connection api
        for(int j=0; j<activeLinks.size(); j++){

            HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLinks.get(j).getAttribute("href")+"--------->>> "+response);
        }

    }

    public void typeOnElement(String locator, String value) {
        try {driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }

    public void typeOnElementEntry(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    public void typeOnElementNEnterCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void typeOnElementNEnterClass (String locator, String value){

        driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
    }

    public void getEelementsByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void getSubmitByXpath(String locator){
        driver.findElement(By.xpath(locator)).submit();
    }
    public void getEelementsByxpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void getEelementsByID(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }
    public void selectOnid1(String locator){
        Select select1 = new Select(driver.findElement(By.id(locator)));

    }
    public void putElementOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void selectElementOnxpath(String locator){
        WebElement select = driver.findElement(By.xpath(locator));select.click();

    }
    public void selectElementOnclass (String locator){
        WebElement select4 = driver.findElement(By.className(locator));select4.click();
    }
    public void clickByClassName(String locator) {
        driver.findElement(By.className(locator)).click();
    }

    public void selectOnid2(String locator, String value) {
        Select select2 = new Select(driver.findElement(By.id(locator)));
        select2.selectByVisibleText(value);
    }
    public void selectOnname(String locator, String value) {
        Select select3 = new Select(driver.findElement(By.name(locator)));
        select3.selectByVisibleText(value);
    }

}



