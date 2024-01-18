package com.fb.testCases;

import com.fb.base.BaseClass;
import com.fb.pages.HomePage;
import com.fb.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.fb.base.BaseClass.webDriver;

public class SignUpPageTest extends BaseClass {

    SignUpPage signUpPage;
    HomePage homePage;

    public SignUpPageTest(){
        super();
    }

    @BeforeMethod
    public void setSignUpPage(){
        initialization();
        signUpPage=new SignUpPage();
    }

    @Test(priority = 1)
    public void validateLoginPageTitleTest(){
        String title= SignUpPage.validateSignUpPageTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
        webDriver.close();
    }

    @Test
    public void signUpFb(){
        homePage= signUpPage.signUpFb(properties.getProperty("firstname"),properties.getProperty("surname"),properties.getProperty("mobileNumber"),properties.getProperty("newPassword"),properties.getProperty("day"),properties.getProperty("month"),properties.getProperty("year"));
    }

    @AfterMethod
    public void terminate(){
        webDriver.quit();
    }
}
