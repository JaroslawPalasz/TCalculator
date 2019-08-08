package com.javafee.kengine;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.util.concurrent.AtomicDouble;

public class Multiplication implements GenericCalculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable * secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		List<Double> DoublesList = Arrays.asList(variables);
		double result = DoublesList.get(0);
		for (int i = 1; i < DoublesList.size(); i++) {
			result *= DoublesList.get(i);
		}
		return result;
	}

	@Override
	public Double calculate(String... stringsVariables) {
		List<String> stringList = Arrays.asList(stringsVariables);
		AtomicDouble result = new AtomicDouble(Double.parseDouble(stringList.get(0))),
				multiplicationHelper = new AtomicDouble(1.0);
		AtomicInteger index = new AtomicInteger(0);
		stringList.forEach(e -> {
			if (index.get() != 0) {
				multiplicationHelper.set(result.get() * Double.parseDouble(stringList.get(index.get())));
				result.set(multiplicationHelper.get());
			}
			index.getAndIncrement();
		});
		return result.get();
	}
}
