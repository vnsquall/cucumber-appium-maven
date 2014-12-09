package com.lazada.ios;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ios.iOS_InitPage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by vnsquall on 11/27/14.
 */
public class iOS_Steps {
    DriverFactory df = new DriverFactory();
    iOS_InitPage initPage = new iOS_InitPage();

    @Before(value = "@iOS")
    public void setUp() throws MalformedURLException {
        df.setUp("iOS");
    }

    @Given("^user is on InitPage$")
    public void user_is_on_InitPage() throws InterruptedException {
        initPage.verifyInitPageLoaded();
    }

    @When("^user click on country dropdown$")
    public void user_click_on_country_dropdown() {
        initPage.click_CountryPicker();
    }

    @Then("^user can choose from list and done$")
    public void user_can_choose_from_list_and_done() {
        initPage.click_DonePicker();
    }

    @After
    public void tearDown() throws Exception {
        df.tearDown();
    }
}
