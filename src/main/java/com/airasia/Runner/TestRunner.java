package com.airasia.Runner;

import cucumber.api.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


	@CucumberOptions(
			features = "C:\\Users\\38223\\eclipse-workspace\\AirAsia\\src\\main\\java\\com\\airasia\\features\\airasia.feature", //the path of the feature files
			glue={"com/airasia/stepDefinations"}, //the path of the step definition files
			format= {
					"pretty",
					"html:target/AirAsia-reports/AirAsia-pretty", 
					"json:target/AirAsia-reports/AirAsiaTestReport.json",
					"rerun:target/AirAsia-reports/rerun.txt"
					},plugin = "json:target/AirAsia-reports/AirAsiaTestReport.json"		
			)
	 
	public class TestRunner {
	
	 private TestNGCucumberRunner testNGCucumberRunner;
	 
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	 
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
	 
	}
	
	