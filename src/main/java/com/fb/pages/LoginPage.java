package com.fb.pages;

import com.fb.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(name="email")
    WebElement email;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"login_link\"]/div/a")
    WebElement forgetPassword;

    @FindBy(xpath = "//input[contains()@class,'_97vu img']")
    WebElement fbLogo;

    @FindBy(xpath = "//*[@id=\"u_0_0_F5\"]")
    WebElement signUp;


    public LoginPage(){
        PageFactory.initElements(webDriver,this);
    }

    public String validateLoginPageTitle(){
        return webDriver.getTitle();
    }

    public boolean validateLogo(){
       return fbLogo.isDisplayed();
    }

//    public void forgotPass(String fgtPass){
//        forgetPassword.sendKeys(fgtPass);
//    }

    public HomePage loginFb(String em,String pass){
        email.sendKeys(em);
        password.sendKeys(pass);
        loginBtn.click();

        return new HomePage();

    }
}
