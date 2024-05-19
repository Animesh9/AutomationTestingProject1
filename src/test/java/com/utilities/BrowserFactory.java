package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class BrowserFactory {
    public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
    {

        if(browserName.equals("Chrome"))
        {

            ChromeOptions op = new ChromeOptions();
            op.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(op);
        }
        else if(browserName.equals("Firefox"))
        {

            driver = new FirefoxDriver();
        }
        else if(browserName.equals("IE"))
        {

            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("We do not support this browser ");
        }


        driver.manage().window().maximize();
        driver.get(appUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        return driver;

    }

    public static void quitBrowser(WebDriver driver)
    {
        driver.quit();
    }
}
