package com.epam.dataProvider.cucumberTask;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/epam/dataProvider/sample.features")
public class Runner {
}
