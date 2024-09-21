package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSeatPage {
    WebDriver driver;
    public SelectSeatPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement SelectSeatButton_FirstOption = driver.findElement(By.className("selectbutton"));
    public void ClickOnSelectSeatButton(){
        SelectSeatButton_FirstOption.click();
    }
}

