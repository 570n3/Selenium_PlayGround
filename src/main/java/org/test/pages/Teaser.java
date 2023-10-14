package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Teaser {

    private WebDriver driver;
    private By teaserContainer = By.id("Locator");
    private By teaserTitle = By.cssSelector("Locator");
    private By teaserDescription = By.cssSelector("Locator");
    private By teaserImage = By.cssSelector("Locator");
    private By teaserCTATitle = By.cssSelector("Locator");

    private By teaserCTAIcon = By.cssSelector("Locator");

    public Teaser(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTeaserContainer() {
        return driver.findElement(teaserContainer);
    }

    public boolean isTeaserDisplayed() {
        return driver.findElement(teaserContainer).isDisplayed();
    }

    public String getTeaserTitle() {
        return driver.findElement(teaserTitle).getText();
    }

    public String getTeaserDescription() {
        return driver.findElement(teaserDescription).getText();
    }

    public boolean isTeaserImageDisplayed() {
        return driver.findElement(teaserImage).isDisplayed();
    }

    public String getCTATitle() {
        return driver.findElement(teaserCTATitle).getText();
    }
    public String clickTeaser() throws InterruptedException {

        WebElement ele = driver.findElement(teaserCTAIcon);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        return driver.getCurrentUrl();
    }

}
