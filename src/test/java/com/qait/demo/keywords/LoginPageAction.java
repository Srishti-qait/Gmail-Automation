package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;

/**
 * Created by anilsingh on 07-07-2017.
 */
public class LoginPageAction extends GetPage {
    public LoginPageAction(WebDriver driver) {
        super(driver,"LoginPage");
       System.out.println( getCurrentURL());
      // System.out.println( getPageTitle());
      //verifyPageTitleExact(" " ) ;
      //testPageLayout();
     //  System.out.println( login pagegetCurrentURL());
      //  logMessage(String message);
       
    }

    public void clickOnLoginButton(){

        wait.waitForPageToLoadCompletely();
        isElementDisplayed("login_container");
        element("login_container").click();
        logMessage("Clicked On login container");
    }

    public void submitLoginDetails()
    {
        isElementDisplayed("txt_id");
        element("txt_id").clear();
        element("txt_id").sendKeys(YamlReader.getData("username"));
        isElementDisplayed("btn_id");
        element("btn_id").click();
        isElementDisplayed("txt_password");
        element("txt_password").clear();
        element("txt_password").sendKeys(YamlReader.getData("password"));
        isElementDisplayed("btn_password");
        element("btn_password").click();
        verifyPageTitleContains(" ");

    }


}
