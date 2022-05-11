package org.example.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/example/features",
        plugin = "json:target/jsonReports/cucumber-report.json",
        glue = "org.example.stepdefinition"
)
public class TestRunner {
}
