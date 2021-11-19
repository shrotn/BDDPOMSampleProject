package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true, features = "src//test//resources//Features//",
glue = {"stepdefs"}, monochrome = true, dryRun = false, plugin = {"pretty", "html: target/reports/htmlreport1.html", 
		"rerun:target/failed_scenarios.txt"
		//"usage:target/reports/usageReport", "json:target/reports/jsonReport.json",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		} )
//pretty - to generate cloud reports

public class CRMRunner extends AbstractTestNGCucumberTests  {

}
