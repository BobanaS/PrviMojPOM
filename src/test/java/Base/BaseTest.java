package Base;

import Pages.ElementsPage;
import Pages.SidebarPage;
import Pages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public SidebarPage sidebarPage;
    public ElementsPage elementsPage;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }
}
