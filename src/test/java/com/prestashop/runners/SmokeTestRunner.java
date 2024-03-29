package com.prestashop.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		 
		},
		
		tags="@ahmed",
		features="src/test/resources/com/prestashop/features", 
		glue="com/prestashop/step_definitions"
		
		,dryRun = true
		)
public class SmokeTestRunner {}
