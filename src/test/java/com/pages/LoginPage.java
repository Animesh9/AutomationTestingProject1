package com.pages;

import com.utilities.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver1){
        this.driver = driver1;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btn-make-appointment")
    WebElement login;
    @FindBy(xpath = "//span[@id='demo_username_label']/following-sibling::input")
    WebElement getUsername;
    @FindBy(xpath = "//span[@id='demo_password_label']/following-sibling::input")
    WebElement getPassword;

    @FindBy(id = "txt-username")
    WebElement username;
    @FindBy(id = "txt-password")
    WebElement password;
    @FindBy(id = "btn-login")
    WebElement loginButton;
    @FindBy(id = "combo_facility")
    WebElement facility;
    @FindBy(id = "chk_hospotal_readmission")
    WebElement hospitalReadmission;
    @FindBy(id = "radio_program_none")
    WebElement none;
    @FindBy(xpath = "//div[@class='input-group-addon']")
    WebElement calender;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='6']")
    WebElement date;
    @FindBy(id = "txt_comment")
    WebElement comment;
    @FindBy(id = "btn-book-appointment")
    WebElement submit;

    public void loginSuccess(){
        login.click();
        String uName = getUsername.getAttribute("value");
        String pwd = getPassword.getAttribute("value");
        username.sendKeys(uName);
        password.sendKeys(pwd);
        loginButton.click();
        Select selectFacility = new Select(facility);
        selectFacility.selectByValue("Tokyo CURA Healthcare Center");
        hospitalReadmission.click();
        none.click();
        calender.click();
        date.click();
        comment.sendKeys("Appointment");
        submit.click();
    }



}
