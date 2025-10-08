package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
    private By userDropdown = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private By logoutButton = By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    public void logout() {
        driver.findElement(userDropdown).click();
        driver.findElement(logoutButton).click();
    }

	public void navigateToAddEmployee() {
		// TODO Auto-generated method stub
		
	}
}
