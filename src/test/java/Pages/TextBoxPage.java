package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    WebDriver driver;
    WebElement userNameField;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;


    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    //-------------------------------------------------
    public void inputUsername(String username) {
        getUserNameField().clear();
        getUserNameField().sendKeys(username);
    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void inputPermanentAddress(String permanentAddress){
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(permanentAddress);
    }
    public void clickOnSubmitButton() {
        getSubmitButton().click();

    }
}