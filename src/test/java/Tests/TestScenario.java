package Tests;

import Pages.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestScenario extends TestBase{
    @Test
    public void Scenrio(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        HomePage home = new HomePage(driver);
        home.EnterDataInLeavingFromField("CHIKKAMAGALURU");
        home.EnterDataInGoingToField("BENGALURU");
        home.ClickOnDateIcon();
        home.ClickOnDate();
        home.ClickOnSearchBoxButton();

        SelectSeatPage seat = new SelectSeatPage(driver);
        seat.ClickOnSelectSeatButton();

        FirstOptionOfSelectSeatPage FOSeat = new FirstOptionOfSelectSeatPage(driver);
        FOSeat.ClickOnSelectBoardingPointAndChooseFirstOption();
        FOSeat.ClickOnSelectDroppingPointAndChooseFirstOption();
        FOSeat.ClickOnSeatNumber();
        FOSeat.ClickOnProvidePassengerDetailsButton();

        CustomerDetailsPage Customer = new CustomerDetailsPage(driver);
        Customer.EnterMobileInMobileField("6789125987)");
        Customer.EnterEmailInEmailField("Sara@gmail.com");
        Customer.ClickOnProceedTOPassengerDetailButton();

        PassengerDetailsPage passenger = new PassengerDetailsPage(driver);

        passenger.EnterNameInFieldName("Sara");
        passenger.ClickOnGenderField();
        passenger.EnterGenderInSearchFieldOfGender("Femail");
        passenger.EnterAgeInAgeFiled("21");
        passenger.ClickOnConcession();
        passenger.EnterDataInSearchFieldOfConcession("GENERAL PUBLIC");
        passenger.ClickOnIdCardField();
        passenger.EnterIdCardInSearchField("123");
        passenger.EnterIdCardNo("123");
        passenger.ClickOnCountryField();
        passenger.EnterDataInCounterySearchField("India");


    }
}
