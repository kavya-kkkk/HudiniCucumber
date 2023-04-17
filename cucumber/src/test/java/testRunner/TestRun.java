package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature", // feature file path

		glue = "stepDefinitions", // package name
		dryRun =false, // all steps having step definition or not
				monochrome = true,
				   plugin = {"pretty", "html:target/cucumber-reports",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})//"html:target/myreport/test_output1"},

		//plugin = { "pretty", "json:target/myreport/report.json","junit:target/myreport/report1.xml","html:target/myreport/test_output1","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } // "json:target/myreport/report.json","junit:target/myreport/report1.xml",
// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
// //to print html report



public class TestRun {
	
}

/*
 * @AfterClass public static void writeExtentReport() {
 * Reporter.loadXMLConfig(new
 * File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath())
 * ); Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
 * Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
 * Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
 * Reporter.setSystemInfo("Selenium", "3.7.0"); Reporter.setSystemInfo("Maven",
 * "3.5.2"); Reporter.setSystemInfo("Java Version", "1.8.0_151"); //multiple
 * tags means and ","and add tag name to run specific scenarios
 */
// plugin = {
// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},*/

/*
 * features= ".//Features/",//to run all the features files features=
 * {".//Features/AddClient.feature", ".//Features/AddClient.feature",
 * ".//Features/AddClient.feature"} to run particular features fils
 * "html:target/myreport/test_output1","json:target/myreport/report.json",
 * "junit:target/myreport/report1.xml" ===reports
 */