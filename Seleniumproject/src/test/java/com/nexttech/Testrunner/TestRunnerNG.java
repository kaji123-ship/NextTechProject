package com.nexttech.Testrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class TestRunnerNG {

	
	
	@CucumberOptions(
	
	features = {"Features"},
	glue = {"com.nexttech.stepdef"},
	tags= {"@sanity"},
	monochrome= true,
	dryRun= false
	
	)
	
	public class TestRunner extends AbstractTestNGCucumberTests  {}
}
