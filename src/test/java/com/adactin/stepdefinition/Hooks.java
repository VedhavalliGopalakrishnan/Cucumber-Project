package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass {
	
	@Before
	public void beforeHooks(Scenario scenario) {
      String name = scenario.getName();
      System.out.println("Scenario name : " + name);
	}
	
	@After
    public void afterHooks(Scenario scenario) throws Throwable {
      Status status = scenario.getStatus();
      System.out.println("Scenario status : " + status);
      
      if (scenario.isFailed()) {
		takeScreenShot();
	}
	}
}
