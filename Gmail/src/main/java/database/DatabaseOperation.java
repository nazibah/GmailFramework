package database;

import Util.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getSearchValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "searchList", "searchItems");
    }

    public static List<String> getSearchValue() {
        List<String> searchList = new ArrayList<>();
        searchList.add("Help");
        searchList.add("Privacy");
        searchList.add("Terms");
        return searchList;
    }

    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("searchList", "searchItems");
        System.out.println(list);
        return list;
    }

    @FindBy(xpath = "//*[@id=\"initialView\"]/footer/ul/li[1]/a")
    WebElement help;
    @FindBy(xpath = "//*[@id=\"initialView\"]/footer/ul/li[2]/a")
    WebElement privacy;
    @FindBy (xpath = "//*[@id=\"initialView\"]/footer/ul/li[3]/a")
    WebElement terms;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(help);
        headerList1.add(privacy);
        headerList1.add(terms);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("searchList", "searchItems");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
