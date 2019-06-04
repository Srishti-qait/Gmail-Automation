package com.qait.demo.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class LoginTest {

    private TestSessionInitiator testSessionInitiator;

    @BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
    }

    @Test
    public void test01_verifyUseLoginOn() throws InterruptedException{
        testSessionInitiator.launchApplication();
   
        testSessionInitiator.loginPageAction.submitLoginDetails();
        
   
    }
    @Test
    public void test02_verifycopymail() throws InterruptedException{
       
        testSessionInitiator.inbox.searchDetails();
        testSessionInitiator.inbox.move();
      
    }
}
