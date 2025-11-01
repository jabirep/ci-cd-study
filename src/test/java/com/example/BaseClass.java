package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    protected WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "baseurl"})
    public void setUp(@Optional("chrome") String browser, @Optional("https://practicetestautomation.com/practice-test-login/") String baseurl) {
        // Setup browser
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        // Can add Firefox, Edge etc. here if needed

        driver.manage().window().maximize();
        driver.get(baseurl);
    }

    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

}
