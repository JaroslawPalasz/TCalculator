package com.javafee.kengine;

public interface GenericCalculation {
	Double calculate(Double firstVariable, Double secondVariable);

	Double calculate(Double... variables);

	Double calculate(String... stringsVariables);
}
