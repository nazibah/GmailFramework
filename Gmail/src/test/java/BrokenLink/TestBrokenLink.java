package BrokenLink;

import GmailAPI.GmailCommonAPI;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestBrokenLink extends GmailCommonAPI {
    @Test
    public void findBrokenLinks() throws IOException {
        brokenLink();
    }
}
