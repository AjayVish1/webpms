package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submitBtn")
    private WebElement loginButton;

    @FindBy(className = "sign-out")
    private WebElement signOutButton;

    @FindBy(className = "swal2-confirm")
    private WebElement confirmSignOutButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {

        this.email.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();

        Thread.sleep(3000);
        this.signOutButton.click();
        Thread.sleep(3000);
        this.confirmSignOutButton.click();

    }
}
