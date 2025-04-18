package org.example.tests;

import org.example.tests.BaseTest;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);


    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        LoginData[] data = JSONDataReader.getLoginData();
        Object[][] testData = new Object[data.length][2];

        for (int i = 0; i < data.length; i++) {
            testData[i][0] = data[i].getUsername();
            testData[i][1] = data[i].getPassword();
        }

        return testData;
    }
}
