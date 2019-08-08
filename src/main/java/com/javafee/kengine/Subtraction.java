package com.javafee.kengine;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.util.concurrent.AtomicDouble;

public class Subtraction implements GenericCalculation {

	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable - secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		//AtomicDouble result = new AtomicDouble();
		List<Double> doublesList = Arrays.asList(variables);
		double result = doublesList.get(0);
		for (int i = 1; i < doublesList.size(); i++) {
			result -= doublesList.get(i);
		}
		return result;
	}

	@Override
	public Double calculate(String... stringsVariables) {
		List<String> stringList = Arrays.asList(stringsVariables);
		AtomicDouble result = new AtomicDouble(Double.parseDouble(stringList.get(0)));
		AtomicInteger index = new AtomicInteger(0);
		stringList.forEach(e -> {
			if (index.get() != 0)
				result.getAndAdd(-Double.parseDouble(stringList.get(index.get())));
			index.getAndIncrement();
		});
		return result.get();
	}
}
