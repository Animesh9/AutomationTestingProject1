package com.pages;

import com.utilities.BrowserFactory;
import com.utilities.ConfigDataProvider;
import com.utilities.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public class BaseTest {
    public static final Logger log = Logger.getLogger(BaseTest.class);
    public WebDriver driver;
    public ConfigDataProvider config =new ConfigDataProvider();
    public PageGenerator pageGenerator;

    @BeforeClass
    public void setUp()
    {
        pageGenerator = new PageGenerator(driver);
        driver= BrowserFactory.startApplication(driver,config.getBrowser(),config.getUrl());
    }

    @AfterClass
    public void tearDown()
    {
        BrowserFactory.quitBrowser(driver);
    }
}
