package Tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver driver ;
    @BeforeClass
    public void Setup(){
        driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
    }
    @AfterClass
    public void Teardown(){
        driver.quit();
    }
}
