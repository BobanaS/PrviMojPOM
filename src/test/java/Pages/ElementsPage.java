package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    WebDriver driver;
    WebElement textBox;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }
    //----------------------
    public void clickonTextBox(){
        getTextBox().click();
    }
}
