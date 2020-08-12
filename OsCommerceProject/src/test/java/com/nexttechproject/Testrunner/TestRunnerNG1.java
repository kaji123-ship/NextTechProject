package com.nexttechproject.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		//(if we run only one feature file)	
	//features=".//Features/LoginValidation.feature",	or providing the tags	
	features = {"Features"},
	glue = {"com.nexttechproject.stefdef"},
	//tags = {"@SmokeTest"},
	dryRun = false,
	monochrome=true,
    plugin = {"pretty"}
	
	
	)
	
	public class TestRunnerNG1 extends AbstractTestNGCucumberTests  {}
	
	
	
	
	
	
	
	
	

