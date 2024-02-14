package com.fb.testCases;

import com.fb.base.BaseClass;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

  public LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setLoginPage(){
        initialization();
        loginPage=new LoginPage();

    }

    @Test(priority = 1)
    public void validateLoginPageTitleTest(){
       String titleLoginPage= loginPage.validateLoginPageTitle();
        Assert.assertEquals(titleLoginPage,"Facebook – log in or sign up");
        webDriver.close();
    }

    @Test(priority = 2)
    public void loginFbTest(){
      homePage=loginPage.loginFb(properties.getProperty("email"),properties.getProperty("password"));
    }


//    @AfterTest
//    public void close(){
//        webDriver.quit();
//    }
}
