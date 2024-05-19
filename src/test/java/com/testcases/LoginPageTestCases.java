package com.testcases;

import com.pages.BaseTest;
import com.pages.LoginPage;
import com.utilities.PageGenerator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTestCases extends BaseTest {


    @Test
    void loginHappyCase() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginSuccess();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Appointment Confirmation", "Appointment Check");
        softAssert.assertAll();
        Thread.sleep(5000);
    }
}
