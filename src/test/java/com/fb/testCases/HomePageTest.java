package com.fb.testCases;

import com.fb.base.BaseClass;
import com.fb.pages.HomePage;
import com.fb.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseClass {
    HomePage homePage;
    LoginPage loginPage;
    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setHomePage(){
        initialization();
        loginPage=new LoginPage();
        homePage=loginPage.loginFb(properties.getProperty("email"),properties.getProperty("password"));

    }


    @Test(priority = 1)
    public void navigateHomePage() throws InterruptedException, IOException {
        homePage=homePage.homepageNavigation();
    Thread.sleep(7000);
    }

    @Test(priority = 2)
    public void validateHomePage(){
        String titleHomePage= homePage.validateHomePageTitle();
        Assert.assertEquals(titleHomePage,"Facebook");
        webDriver.close();

    }


    @AfterMethod
    public void terminateHomePage(){
        webDriver.quit();
    }
}
