package com.javafee.kengine;

import com.google.common.util.concurrent.AtomicDouble;

import java.util.Arrays;
import java.util.List;

public class Division implements GenericCalculation {

	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable / secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		List<Double> DoublesList= Arrays.asList(variables);
		double result = DoublesList.get(0);
		for (int i = 1; i < DoublesList.size(); i++) {
			result/=DoublesList.get(i);
		}
		return result;
	}

	@Override
	public Double calculate(String... stringsVariables) {
		AtomicDouble result = new AtomicDouble();
		Arrays.asList(stringsVariables).forEach(e -> result.getAndAdd(Double.valueOf(e)));
		//return result.get();
		return null;
	}
}
