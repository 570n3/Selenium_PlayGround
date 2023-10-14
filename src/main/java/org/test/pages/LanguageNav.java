package org.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class LanguageNav {

    private WebDriver driver;
    private WebElement navigation;

    public LanguageNav(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        navigation = driver.findElement(By.xpath("Locator"));
    }

    public String clickNavItemAndGetUrl(int itemIndex) {
        Actions action = new Actions(driver);
        action.moveToElement(navigation).perform();
        WebElement navItem = driver.findElement(By.xpath("Locator[" + itemIndex + "]/a"));
        action.moveToElement(navItem).click().perform();

        return driver.getCurrentUrl();
    }
}

