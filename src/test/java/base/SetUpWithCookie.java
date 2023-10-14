package base;

import org.test.pages.CookieToolbar;
import org.test.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;


public class SetUpWithCookie {

    protected WebDriver driver;
    protected CookieToolbar homePage;
    private static final String HOME_PAGE_URL = "https://example/en";

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(HOME_PAGE_URL);
        driver.manage().window().maximize();
        homePage = new CookieToolbar(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
