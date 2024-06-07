package Tests;

import Base.BaseTest;
import Pages.ElementsPage;
import Pages.SidebarPage;
import Pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Zadatak 11) Testirati
// Text Box funkciju na https://demoqa.com/
public class TestBox extends BaseTest {


    @BeforeMethod
    public void pageSetUp(){
        driver = new ChromeDriver();
        sidebarPage= new SidebarPage(driver);
        elementsPage=new ElementsPage(driver);
        textBoxPage=new TextBoxPage(driver);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
    }
    public void gotoTextBoxPage(){
        sidebarPage.clickonElements();
        elementsPage.clickonTextBox();
    }
    @Test
    public void test1(){
    gotoTextBoxPage();
    textBoxPage.inputUsername("Bobana");
    textBoxPage.inputEmail("bobana.simikic@gmail.com");
    textBoxPage.inputCurrentAddress("Sremska Mitrovica");
    textBoxPage.inputPermanentAddress("Sremska Mitrovica");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", textBoxPage.getSubmitButton());
    textBoxPage.clickOnSubmitButton();
        Assert.assertEquals(driver.findElement(By.id("name")).getText(),"Name:Bobana");
        Assert.assertNotNull(driver.findElement(By.cssSelector("#output > div")));
    }
}
