package com.javafee.kengine;

import java.util.Arrays;
import java.util.List;

public class Subtraction implements GenericCalculation {

	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable - secondVariable;
	}

	@Override
	public Double calculate(Double... variables) {
		//AtomicDouble result = new AtomicDouble();
		List<Double> DoublesList= Arrays.asList(variables);
		double result = DoublesList.get(0);
		for (int i = 1; i < DoublesList.size(); i++) {
			result-=DoublesList.get(i);
		}
		return result;
	}

	@Override
	public Double calculate(String... stringsVariables) {
		List<String> StringList=Arrays.asList(stringsVariables);
		double result=Double.valueOf(StringList.get(0));
		for(String e : stringsVariables)
		{

		}
		//Arrays.asList(stringsVariables).forEach(e -> result.getAndAdd(Double.valueOf(e)));
		return null;
	}
}
