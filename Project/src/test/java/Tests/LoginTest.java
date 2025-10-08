package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.DashboardPage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {
        LoginPage login = new LoginPage(driver);
        DashboardPage dashboard = login.loginAs(config.getProperty("username"), config.getProperty("password"));

        // Wait briefly for dashboard to appear
        try { Thread.sleep(2000); } catch (InterruptedException e) { }

        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Login failed!");
    }

    @Test
    public void verifyInvalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("wrongUser");
        login.enterPassword("wrongPass");
        login.clickLogin();

        Assert.assertTrue(login.getInvalidMessage().contains("Invalid credentials"));
    }
}
