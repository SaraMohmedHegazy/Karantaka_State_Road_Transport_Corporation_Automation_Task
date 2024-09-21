package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerDetailsPage {
    WebDriver driver;
    public CustomerDetailsPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement MobileNumberField = driver.findElement(By.name("mobileNo"));
    WebElement EmailIdField = driver.findElement(By.name("email"));
    WebElement ProceedTOPassengerDetailButton = driver.findElement(By.xpath("//div[text()='PROCEED TO passenger detail as']"));
     public void EnterMobileInMobileField(String mobileNumber){
         MobileNumberField.sendKeys(mobileNumber);
     }
     public void EnterEmailInEmailField(String Email){
         EmailIdField.sendKeys(Email);

     }
     public void ClickOnProceedTOPassengerDetailButton(){
         ProceedTOPassengerDetailButton.click();
     }

}
