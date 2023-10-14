package org.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public static WebDriver getDriver() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64\\chromedriver.exe");

        // Create and return a new instance of the ChromeDriver
        return new ChromeDriver();
    }
}
