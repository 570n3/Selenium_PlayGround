package tests;

import base.SetUpWithoutCookie;
import org.test.pages.LanguageNav;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageNavTest extends SetUpWithoutCookie {
    @Test
    public void langNavActive() {
        LanguageNav nav = new LanguageNav(driver);

        int[] navigationItemIndices = {2, 3};
        String[] expectedUrls = {"https://example.com/en", "https://www.example.com/de"};

        for (int i = 0; i < navigationItemIndices.length; i++) {
            int itemIndex = navigationItemIndices[i];
            String expectedUrl = expectedUrls[i];
            String actualUrl = nav.clickNavItemAndGetUrl(itemIndex);
            Assert.assertEquals(actualUrl, expectedUrl, "Redirected URL did not match the expected URL.");

            driver.navigate().back();
        }
    }
}
