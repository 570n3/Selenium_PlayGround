package tests;

import base.SetUpWithCookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CookieToolbarTest extends SetUpWithCookie {

    @Test(priority = 1)
    public void verifyToolbarIsDisplayed() throws InterruptedException {
        Assert.assertTrue(homePage.isToolbarDisplayed(), "Toolbar component is not displayed.");
        //logger.error("Assertion failed: Expected '{}' but actual was '{}'", expectedValue, actualValue);
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void verifyToolbarTitle() throws InterruptedException {
        String expectedTitle = "The website uses cookies";
        String actualTitle = homePage.getToolbarHeadline();
        Assert.assertEquals(actualTitle, expectedTitle, "Toolbar Headline mismatch.");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void verifyToolbarDescription() throws InterruptedException {
        String expectedDescription = "text";
        String actualDescription = homePage.getToolbarDescription();
        Assert.assertEquals(actualDescription, expectedDescription, "Toolbar description mismatch.");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void clickReadMore() throws InterruptedException {
        homePage.clickReadMore();
        String expectedDescription = "text";
        String actualDescription = homePage.verifyDomains();
        Assert.assertEquals(actualDescription, expectedDescription, "toolbar description mismatch.");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void clickSetting() throws InterruptedException {
        homePage.clickSettings();
        Thread.sleep(2000);
    }


    @Test(priority = 6)
    public void clickShowDetails() throws InterruptedException {
       homePage.clickShowDetails();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void clickHideDetails() throws InterruptedException {
        homePage.clickHideDetails();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void clickAccept() throws InterruptedException {
        homePage.clickAccept();
        Thread.sleep(2000);
    }

}
