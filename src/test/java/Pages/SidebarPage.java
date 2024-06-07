package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarPage {
    WebDriver driver;
    WebElement elements;

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElements() {
        return driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1) > div > div.card-up"));
    }
//-------------------------------------------------------

    public void clickonElements(){
        getElements().click();
    }
}
