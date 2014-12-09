package pages.android;

import org.openqa.selenium.By;
import utils.DriverFactory;

/**
 * Created by vnsquall on 11/28/14.
 */
public class android_InitPage extends DriverFactory {
    String countryNameID = appPackage + ":id/country_name";
    By initTxt = By.xpath("//android.widget.TextView[contains(@text, 'Choose Country')]");
    String country = "Singapore";


    /**
     * Verify the Init screen has loaded *
     */
    public void verifyInitPageLoaded() {
        driver.findElement(initTxt);
    }

    public void getCountryList() {
        driver.findElements(By.id("pt.rocket.lazada:id/country_name"));
    }

    public void select_Country() {
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='" + countryNameID + "' and @text='" + country + "']")).click();
    }

}
