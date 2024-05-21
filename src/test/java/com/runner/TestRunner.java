package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = {
		"stepdefination" }, dryRun = true , tags = "@login",

		monochrome = true, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
										"rerun:target/failed_scenarios.txt" })
public class TestRunner {
	
	

}
