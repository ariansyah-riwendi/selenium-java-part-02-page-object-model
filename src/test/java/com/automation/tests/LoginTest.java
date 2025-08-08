package com.automation.tests;

import com.automation.base.BaseSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseSetup {

    @Test
    public void loginSuccess() {
        loginPage.inputUsername("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isLogoDisplayed());
    }
}