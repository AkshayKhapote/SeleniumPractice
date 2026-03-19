package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

    // feature folder path
    features = "src/test/java/FeatureFiles",

    // step definition package name
    glue = "stepDefination",

    tags = "@sanity",

    dryRun = false,

    monochrome = true,

    plugin = {
            "pretty",
            "html:target/HTMLReports/index.html",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }

)
public class TestRunner {

}














	
	


