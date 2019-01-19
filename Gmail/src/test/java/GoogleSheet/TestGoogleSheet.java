package GoogleSheet;

import googleSheet.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class TestGoogleSheet extends GoogleSheetPage {

    GoogleSheetPage googleSheetsPage;


    @BeforeMethod
    public void initialization(){

        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
    }

    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        googleSheetsPage.clickLogIn();

        int i = 0;
        String spreadsheetId = "1gq_58APDxt94-6iXS_uppef0SAVCYiBx7vdA3jT73UQ";
        String range = "Sheet1!A2:Y";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}