package com.javafee.kengine;

public class Multiplication implements GenericCalculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable * secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		return null;
	}

	@Override
	public Double calculate(String... stringsVariables) {
		return null;
	}
}
