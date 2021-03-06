package com.myname.demo;

import org.testng.Assert;
import org.testng.annotations.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class LoginTests {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite is executed");
    }

    @AfterSuite
        public void afterSuite(){
            System.out.println("After suite is executed");
        }

    @Parameters({"browser", "os"})
        @BeforeTest
    public void beforeTest(String browser, String os){
        System.out.println("Before test is executed");
        System.out.println("Browser = " + browser);
        System.out.println("OS = " + os);
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test is executed");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class method executed");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class method executed");
    }
    @BeforeMethod
        public void beforeMethod() {
        System.out.println("Before method executed..");
    }

        @AfterMethod
        public void afterMethod(){
            System.out.println("After method executed...");
        }


    @Test (priority = 1,
            testName = "Login with valid name and password",
            dataProvider= "userInfo",
    dataProviderClass = TestData.class)
    public void loginWithValidTest(String username, String password){
        System.out.println("Login test with valid user and password");
        System.out.println("username:" + username);
        System.out.println("password: " + password);
        String exp = "hello";
        String act ="hello";
               Assert.assertEquals(act, exp, "the words dont match");
    }

    @Test (priority = 2, testName ="Login with invalid name and password" )
    public void loginwithInvalidTest(){
        System.out.println(" Login with invalid test user and password");
        Assert.fail(" Invalid user, login test failed");
    }

    @Test (priority = 3, testName = "Verify homepage title")
    public void homePageTest(){
        System.out.println("this is a home page test");
        String act= "Homepage";
        String exp="Homepage";
        Assert.assertTrue(exp==act, "homepage title is incorrect");
    }

    @Test (priority = 4, testName = "Verify logout")
    public void logOutTest(){
        System.out.println("This is a logout test");
    }
}
