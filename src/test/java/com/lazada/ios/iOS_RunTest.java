package com.lazada.ios;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by vnsquall on 11/27/14.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"}
)
public class iOS_RunTest extends AbstractTestNGCucumberTests {
}
