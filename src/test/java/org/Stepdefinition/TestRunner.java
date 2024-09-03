package org.Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.Stepdefinition",
monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin = {"html:Report" , "junit:Report\\Junitreport.xml","json:Report\\junitRepory.json"}) 
public class TestRunner {
	
	
}
