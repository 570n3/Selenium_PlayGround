package base;

import org.test.pages.Teaser;
import org.test.utils.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUpWithoutCookie {

    protected WebDriver driver;
    protected Teaser homePage;
    private static final String HOME_PAGE_URL = "https://example.com/en";

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get(HOME_PAGE_URL);
        driver.manage().window().maximize();
        homePage = new Teaser(driver);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript("$(document).ready(function(){\n" +
                    "    $('#cookie-information-template-wrapper').html('');\n" +
                    "});");
            jse.executeScript("$(document).ready(function() {\n" +
                    "    $('header').css('position','absolute');\n" +
                    "})");
        } catch (WebDriverException e) {
            System.out.println("An uncaught JavaScript exception has occurred: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}