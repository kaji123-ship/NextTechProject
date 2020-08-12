package com.qa.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		//(if we run only one feature file)	
	//features=".//Features/LoginValidation.feature",	or providing the tags	
	features = {"C:\\Users\\bhai_\\eclipse-workspace\\OrangHRMProject\\src\\test\\java\\com\\qa\\feature\\OrangHRM.feature"},
	glue = {"com/qa/stepdefinition"},
	//tags = {"~@SmokeTest","@sanityTesting"},
	dryRun = false,
	//strict = false,
	monochrome=true,
    plugin = {"pretty"}
	
	
	)
	
	public class TestRunner extends AbstractTestNGCucumberTests  {}
	
	
	
	