package com.fb.pages;

import com.fb.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {

    @FindBy(linkText = "Create new account")
    WebElement signUp;

    @FindBy(name = "firstname")
    WebElement firstname;

    @FindBy(name = "lastname")
    WebElement surname;

    @FindBy(name = "reg_email__")
    WebElement mobileNumber;

    @FindBy(name = "reg_passwd__")
    WebElement newPassword;

    @FindBy(id = "day")
    WebElement day;

    @FindBy(name ="birthday_month")
    WebElement month;

    @FindBy(name = "birthday_year")
    WebElement year;

    @FindBy(xpath = "(//label[@class='_58mt'])[2]")
    WebElement gender;

    @FindBy(name = "websubmit")
    WebElement sign;

    public SignUpPage(){
        PageFactory.initElements(webDriver,this);
    }

    public static String validateSignUpPageTitle(){
        return webDriver.getTitle();
    }


    public HomePage signUpFb(String fn,String sn,String num,String nPass,String d,String m,String y){
        signUp.click();
        firstname.sendKeys(fn);
        surname.sendKeys(sn);
        mobileNumber.sendKeys(num);
        newPassword.sendKeys(nPass);
        day.sendKeys(d);
        month.sendKeys(m);
        year.sendKeys(y);
        gender.click();
        sign.click();

        return new HomePage();
    }
}
