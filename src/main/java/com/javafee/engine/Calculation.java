package com.javafee.engine;

public class Calculation {
	private double firstVariable;
	private double secondVariable;
	private double result;

	public double calculate(double firstVariable, double secondVariable) {
		return this.result;
	}

	public double getFirstVariable() {
		return firstVariable;
	}

	public void setFirstVariable(double firstVariable) {
		this.firstVariable = firstVariable;
	}

	public double getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(double secondVariable) {
		this.secondVariable = secondVariable;
	}

	public double getResult() {
		return result;
	}

	public double setAndGetResult(double result) {
		this.result = result;
		return result;
	}
}
