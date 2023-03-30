package com.swarpa.Utils;

import io.cucumber.java.Scenario;



public class ScenarioContext {
	protected Scenario scenario;
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
}
