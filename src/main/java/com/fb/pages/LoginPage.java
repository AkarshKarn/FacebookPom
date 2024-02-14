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

    @FindBy(name = "login")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(webDriver,this);
    }

    public String validateLoginPageTitle(){
        return webDriver.getTitle();
    }

    public HomePage loginFb(String em,String pass){
        email.sendKeys(em);
        password.sendKeys(pass);
        loginBtn.click();
        return new HomePage();


    }
}
