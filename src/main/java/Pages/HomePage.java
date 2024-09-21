package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    WebElement LeavingFromField = driver.findElement(By.xpath("//span[text() = 'Select Departure City']"));
    WebElement GoingToField = driver.findElement(By.xpath("//span[text() = 'Select Destination City']"));
   WebElement DateIcon =driver.findElement(By.id("imgDepartDate"));
   WebElement Date = driver.findElement(By.xpath("//a[text() = '25']"));
   WebElement SearchBuseButton = driver.findElement(By.id("submitSearch"));

    public void EnterDataInLeavingFromField(String placeFrom){
        LeavingFromField.click();
        LeavingFromField.sendKeys(placeFrom);
        LeavingFromField.sendKeys(Keys.ENTER);

    }
    public void EnterDataInGoingToField(String placeTo){
        GoingToField.click();
        GoingToField.sendKeys(placeTo);
        GoingToField.sendKeys(Keys.ENTER);

    }
    public void ClickOnDateIcon(){
        DateIcon.click();
    }
    public void ClickOnDate(){
        Date.click();
    }
    public void ClickOnSearchBoxButton(){
        SearchBuseButton.click();
    }
}
