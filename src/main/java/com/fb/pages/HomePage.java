package com.fb.pages;

import com.fb.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class HomePage extends BaseClass {

    @FindBy(name="email")
    WebElement email;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(name = "login")
    WebElement loginBtn;

//    @FindBy(xpath ="//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']")
 //   WebElement upload;

//    @FindBy(xpath = "//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8']")
//    WebElement caption;

//    @FindBy(xpath = "//div[@class='x14yjl9h xudhj91 x18nykt9 xww2gxu x6s0dn4 x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x3nfvp2 xl56j7k x1n2onr6 x1qhmfi1 x1vqgdyp x100vrsf']")
//    WebElement selectPic;

//    @FindBy(xpath = "//span[text()='Post']")
//    WebElement post;

//    @FindBy(xpath = "//span[@class='xhb22t3 xb5gni xcj1dhv x6s0dn4 x78zum5 xuxw1ft x47corl x1ye3gou']")
//    WebElement searchFriend;
//
//    @FindBy(xpath = "//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x6prxxf xvq8zen xo1l8bm xzsf02u']")
//    WebElement clickSearchedFriend;

    @FindBy(xpath = "//a[@aria-label='Home']")
    WebElement home;

    @FindBy(xpath = "//span[text()='Akarsh Kumar']")
    WebElement myProfile;

    public HomePage(){
        PageFactory.initElements(webDriver,this);
    }

    public String validateHomePageTitle() {
        return webDriver.getTitle();
    }

    public HomePage homepageNavigation(){
        home.click();
        myProfile.click();

        return new HomePage();
    }

}
