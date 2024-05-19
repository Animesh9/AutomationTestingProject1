package com.utilities;

import com.beust.ah.A;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
    private final WebDriver driver;
    public LoginPage loginPage;

    public PageGenerator(WebDriver driver) {
        this.driver = driver;
    }
    public <TPage> TPage getInstance(Class<TPage> pageClass) {

        try {
            //Initialize the Page with its elements and return it.
            return PageFactory.initElements(this.driver, pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /*public LoginPage loginPage(){
        if(this.loginPage == null){
            this.loginPage = getInstance(LoginPage.class);
        }
        return loginPage;
    }*/


}
