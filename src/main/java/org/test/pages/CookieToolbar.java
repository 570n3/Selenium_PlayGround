package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieToolbar {

    private WebDriver driver;
    private By toolbarContainer = By.xpath("Locator");
    private By toolbarTitle = By.xpath("Locator");
    private By toolbarDescription = By.xpath("Locator");
    private By toolbarReadMore = By.xpath("Locator");
    private By toolbarDomains = By.xpath("Locator");
    private By toolbarSettings = By.xpath("Locator");
    private By toolbarShowDetails = By.xpath("Locator");
    private By toolbarHideDetails = By.xpath("Locator");
    private By toolbarAccept = By.xpath("Locator");
    private By toolbarDecline = By.xpath("Locator");
    public CookieToolbar(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getToolbarContainer() {
        return driver.findElement(toolbarContainer);
    }

    public boolean isToolbarDisplayed() {
        return driver.findElement(toolbarContainer).isDisplayed();
    }

    public String getToolbarHeadline() {
        return driver.findElement(toolbarTitle).getText();
    }

    public String getToolbarDescription() {
        return driver.findElement(toolbarDescription).getText();
    }

    public String clickReadMore() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarReadMore);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        return driver.getCurrentUrl();
    }

    public String verifyDomains() {
        return driver.findElement(toolbarDomains).getText();
    }

    public void clickSettings() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarSettings);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void clickShowDetails() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarShowDetails);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void clickHideDetails() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarHideDetails);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public void clickAccept() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarAccept);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public String clickDecline() throws InterruptedException {

        WebElement ele = driver.findElement(toolbarDecline);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        return driver.getCurrentUrl();
    }

}
