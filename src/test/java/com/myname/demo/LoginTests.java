package com.myname.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test (priority = 1, testName = "Login with valid name and password")
    public void loginwithValidTest(){
        System.out.println("Login test with valid user and password");
        String exp = "hello";
        String act ="hello";
               Assert.assertEquals(act, exp, "the words don match");
    }

    @Test (priority = 2, testName ="Login with invalid name and password" )
    public void loginwithInvalidTest(){
        System.out.println(" Login with invalid test user and password");
    }

    @Test (priority = 3, testName = "Verify homepage title")
    public void homePageTest(){
        System.out.println("this is a home page test");
    }

    @Test (priority = 4, testName = "Verify logout")
    public void logOutTest(){
        System.out.println("This is a logout test");
    }
}
