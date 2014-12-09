package pages.ios;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverFactory;

import static junit.framework.Assert.assertTrue;

/**
 * Created by vnsquall on 11/26/14.
 */
public class iOS_InitPage extends DriverFactory {
    By countryPicker = By.name("LAHomeViewController_OpenPickerViewButton");
    By continueBtn = By.name("LAHomeViewController_ContinueButton");
    By donePicker = By.name("LAHomeViewController_DoneButton");
    By initText = By.name("SELECT YOUR COUNTRY");

    /**
     * Verify the Init screen has loaded *
     */
    public void verifyInitPageLoaded() throws InterruptedException {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(initText));
        assertTrue(driver.findElement(initText).isDisplayed());
    }

    public void click_CountryPicker() {
        driver.findElement(countryPicker).click();
    }

    public void click_ContinueBtn() {
        driver.findElement(continueBtn).click();
    }

    public void click_DonePicker() {
        driver.findElement(donePicker).click();
    }
}
