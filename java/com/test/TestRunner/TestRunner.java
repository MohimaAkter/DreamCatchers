package com.test.TestRunner;

import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;
import com.test.Utils.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources/features"}, format = {"json:target/cucumber.json", "json:target/cucumber-json-report.json"},
glue = "com.StepDefenationOne",
tags = {"@test1"})

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setUp(){
		TestBase test = new TestBase();
		test.Initializetion();
	}
	
	@AfterTest
	public void close() {
		TestBase test = new TestBase();
		test.driver.quit();
	}
}
