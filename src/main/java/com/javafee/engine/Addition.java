package com.javafee.engine;

public class Addition extends Calculation {
	@Override
	public double calculate(double firstVariable, double secondVariable) {
		setFirstVariable(firstVariable);
		setSecondVariable(secondVariable);
		return setAndGetResult(firstVariable + secondVariable);
	}
}
