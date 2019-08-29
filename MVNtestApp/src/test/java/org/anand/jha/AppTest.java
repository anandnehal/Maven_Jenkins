package org.anand.jha;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue= {"stepDef"},
		tags ="@tag1",
		plugin = {"html:target/cucumber-html-report"})
		
public class AppTest {
 
}
