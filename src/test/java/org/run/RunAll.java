package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features= "src\\test\\resources\\featurefile",glue= "org.stepdef", dryRun= false) 
				
	
public class RunAll {
		
}
