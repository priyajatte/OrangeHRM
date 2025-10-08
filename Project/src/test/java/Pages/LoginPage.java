package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // ✅ Updated Locators for new OrangeHRM UI
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By invalidMessage = By.xpath("//p[contains(@class,'oxd-alert-content-text')]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getInvalidMessage() {
        return driver.findElement(invalidMessage).getText();
    }

    public DashboardPage loginAs(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
        return new DashboardPage(driver);
    }
}
