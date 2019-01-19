package googleSheet;

import base.CommonApi;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPI.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.*;

public class GoogleSheetPage extends CommonApi {
    @FindBy(how = CSS, using = "#identifierId")
    public static WebElement user;
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    public static WebElement logInButton;
    @FindBy(xpath = "//div[@class='GQ8Pzc']")
    public static WebElement logInErrorMesage;

    public void clickLogIn() throws InterruptedException {
        sleepFor(4);
        logInButton.click();
    }

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(user, row.get(0).toString());
            actual.add(getTextByWebElement(logInErrorMesage));
            System.out.println(getTextByWebElement(logInErrorMesage));
            clearInputBox(user);
            sleepFor(1);
        }
        return actual;
    }
}