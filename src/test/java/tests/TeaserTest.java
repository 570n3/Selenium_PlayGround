package tests;

import base.SetUpWithoutCookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeaserTest extends SetUpWithoutCookie {

    @Test(priority = 1)
    public void verifyTeaserComponentIsDisplayed() {
        Assert.assertTrue(homePage.isTeaserDisplayed(), "Teaser component is not displayed.");
        // logger.error("Assertion failed: Expected '{}' but actual was '{}'", expectedValue, actualValue);
    }

    @Test(priority = 2)
    public void verifyTeaserTitle() {
        // Verify the teaser title
        String expectedTitle = "Products";
        String actualTitle = homePage.getTeaserTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Teaser title mismatch.");
    }

    @Test(priority = 3)
    public void verifyTeaserDescription() {
        String expectedDescription = "text";
        String actualDescription = homePage.getTeaserDescription();
        Assert.assertEquals(actualDescription, expectedDescription, "Teaser description mismatch.");
    }

    @Test(priority = 4)
    public void verifyTeaserImageDisplayed() {
        Assert.assertTrue(homePage.isTeaserImageDisplayed(), "Teaser image is not displayed.");
    }

    @Test(priority = 5)
    public void verifyCTAButtonDisplayed() {
        String expectedCTATitle = "See all Products";
        String actualCTATitle = homePage.getCTATitle();
        Assert.assertEquals(actualCTATitle, expectedCTATitle, "CTA title mismatch.");
    }
    @Test(priority = 6)
    public void clickTeaser() throws InterruptedException {
        String expectedURL = "https://www.example.com/en/products";
        String actualURL = homePage.clickTeaser();
        Assert.assertEquals(actualURL, expectedURL, "Teaser click URL mismatch.");
    }
}


