package com.cbt.runners;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		//plugin="html:target/cucumber",   /cucumber-parallel-testing/src/test/resources/features   com.cbt.stepdefs
		features="./src/test/resources/features",
		glue="com/cbt/stepdefs"
		)

public class CukesCBT {
	
	

}
