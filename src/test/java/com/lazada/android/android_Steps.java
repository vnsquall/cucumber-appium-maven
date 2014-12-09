package com.lazada.android;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.android.android_InitPage;
import utils.DriverFactory;

import java.net.MalformedURLException;

/**
 * Created by vnsquall on 11/28/14.
 */
public class android_Steps {
    DriverFactory df = new DriverFactory();
    android_InitPage initPage = new android_InitPage();

    @Before(value = "@android")
    public void setUp() throws MalformedURLException {
        df.setUp("android");
    }

    @Given("^user is on InitPage$")
    public void user_is_on_InitPage() throws InterruptedException {
        initPage.verifyInitPageLoaded();
    }

    @When("^user click on country list$")
    public void user_click_on_country_list() {
        initPage.getCountryList();
    }

    @Then("^user choose Singapore$")
    public void user_choose_Singapore() {
        initPage.select_Country();
    }

    @After
    public void tearDown() throws Exception {
        df.tearDown();
    }
}
