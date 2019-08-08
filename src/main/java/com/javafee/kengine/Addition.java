package com.javafee.kengine;


import java.util.Arrays;

import com.google.common.util.concurrent.AtomicDouble;


public class Addition implements GenericCalculation {
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable + secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		AtomicDouble result = new AtomicDouble();
		Arrays.asList(variables).forEach(e -> result.getAndAdd(e));
		return result.get();
	}

	@Override
	public Double calculate(String... stringsVariables) {
		AtomicDouble result = new AtomicDouble();
		Arrays.asList(stringsVariables).forEach(e -> result.getAndAdd(Double.valueOf(e)));
		return result.get();
	}

	@Override
	public String toString() {
		return "";
	}
}
