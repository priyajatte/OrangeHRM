package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
    private WebDriver driver;

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By saveButton = By.id("btnSave");
    private By profileName = By.id("profile-pic");

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addEmployee(String fName, String lName) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(saveButton).click();
    }

    public String getProfileName() {
        return driver.findElement(profileName).getText();
    }
}



