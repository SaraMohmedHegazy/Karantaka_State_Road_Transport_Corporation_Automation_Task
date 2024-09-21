package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstOptionOfSelectSeatPage {
    WebDriver driver;
    public FirstOptionOfSelectSeatPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement SelectBoardingPoint = driver.findElement(By.xpath("//div[text()='Select Boarding Point']"));
    WebElement SelectBoardingPoint_FirstOption = driver.findElement(By.xpath("//div[text()='CHIKKAMAGALURU']"));
    WebElement SelectDroppingPoint = driver.findElement(By.xpath("//div[text()='Select Dropping Point']"));
    WebElement SelectDroppingPoint_FirstOption = driver.findElement(By.xpath("//div[text()='BENGALURU']"));
    WebElement SelectSeatNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[4]/div[1]"));
    WebElement ProvidePassengerDetailsButton = driver.findElement(By.xpath("//div[text()='Provide Passenger Details']"));
    public void ClickOnSelectBoardingPointAndChooseFirstOption(){
        SelectBoardingPoint.click();
        SelectBoardingPoint_FirstOption.click();

    }
    public void ClickOnSelectDroppingPointAndChooseFirstOption(){
        SelectDroppingPoint.click();
        SelectDroppingPoint_FirstOption.click();

    }
    public void ClickOnSeatNumber(){
        SelectSeatNumber.click();
    }
    public void ClickOnProvidePassengerDetailsButton(){
        ProvidePassengerDetailsButton.click();
    }


}
