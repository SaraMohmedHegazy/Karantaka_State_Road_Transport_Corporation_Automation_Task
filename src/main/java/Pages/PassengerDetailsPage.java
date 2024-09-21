package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassengerDetailsPage {
    WebDriver driver;
    public PassengerDetailsPage(WebDriver driver){
        this.driver = driver;
    }
    WebElement FieldName = driver.findElement(By.xpath("//label[text()='Name']"));
    WebElement GenderField = driver.findElement(By.xpath("//label[text()='Gender']"));
    WebElement SearchFieldOfGender = driver.findElement(By.id("searchInput"));
    WebElement AgeField = driver.findElement(By.name("paxAge[0]"));
    WebElement Concession = driver.findElement(By.name("paxConcessionType[0]"));
    WebElement SearchFieldOfConcession = driver.findElement(By.xpath("//input[@placeholder='Search Concession Type']"));
    WebElement IdCard = driver.findElement(By.xpath("//label[text()='Id Card']"));
    WebElement SearchFieldOfIdCard = driver.findElement(By.xpath("//input[@placeholder='Search ID Type']"));
   WebElement IdCardNoField = driver.findElement(By.name("paxIDCardNo[0]"));
   WebElement CountryField = driver.findElement(By.name("paxNationality[0]"));
   WebElement SearchFieldOfCountryField = driver.findElement(By.xpath("//input[@placeholder='Search Country']"));
    public void EnterNameInFieldName(String name){
        FieldName.sendKeys(name);
    }
    public void ClickOnGenderField(){
        GenderField.click();
    }
    public void EnterGenderInSearchFieldOfGender(String Gender){
        SearchFieldOfGender.sendKeys(Gender);
        SearchFieldOfGender.sendKeys(Keys.ENTER);

    }
    public void EnterAgeInAgeFiled(String age){
        AgeField.sendKeys(age);
    }
    public void ClickOnConcession(){
        Concession.click();
    }
    public void EnterDataInSearchFieldOfConcession(String concession){
        SearchFieldOfConcession.sendKeys(concession);
        SearchFieldOfConcession.sendKeys(Keys.ENTER);
    }
    public void ClickOnIdCardField(){
        IdCard.click();
    }
    public void EnterIdCardInSearchField(String id_card){
        SearchFieldOfIdCard.sendKeys(id_card);
        SearchFieldOfIdCard.sendKeys(Keys.ENTER);
    }
    public void EnterIdCardNo(String card_no){
        IdCardNoField.sendKeys(card_no);
    }
    public void ClickOnCountryField(){
        CountryField.click();
    }
    public void EnterDataInCounterySearchField(String country){
        SearchFieldOfCountryField.sendKeys(country);
        SearchFieldOfCountryField.sendKeys(Keys.ENTER);
    }
}
