package com.lazada.android;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by vnsquall on 11/28/14.
 */
//@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"}
)
public class android_RunTest extends AbstractTestNGCucumberTests {
}
