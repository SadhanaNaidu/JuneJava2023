package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\JavaBasic\\CucumberSalesForceFramework\\features\\Oppurtunities.feature",
					glue= {"com.training.steps"},
					plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"})

public class Runner {

}


// tags="@TC19"