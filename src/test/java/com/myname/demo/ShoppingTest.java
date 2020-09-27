package com.myname.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class method executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class method executed");
    }

        @Test
        public void productSearch () {
            System.out.println("searching for a product");
        }

        @Test
        public void addProductToShoppingCart () {
            System.out.println("Adding a product to shopping cart");
        }
    }

