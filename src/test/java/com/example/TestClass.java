package com.example;

import org.testng.annotations.Test;

public class TestClass extends BaseClass{

     @Test
    public void testValidLogin() {

        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.login("student", "Password123");
        //Assert.assertEquals(driver.getTitle(), "Dashboard");

        String tittle=driver.getTitle();

        System.out.println("The tittle is :"+tittle);
        System.out.println("Login Successful");
        System.out.println("===================== ");
        System.out.println("===================== ");
        System.out.println("===================== ");
    }

}
