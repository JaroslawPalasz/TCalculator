package com.javafee.kengine;

import com.javafee.utils.ParametersType;

public class Calculation {
	private GenericCalculation addition = new Addition();
	private GenericCalculation subtraction = new Subtraction();
	private GenericCalculation division = new Division();
	private GenericCalculation multiplication = new Multiplication();

	public Double calculate(Double firstVariable, Double secondVariable, char sign) {
		return invokeCalculations(firstVariable, secondVariable,
				null, null, sign);
	}

	public Double calculate(String firstVariable, String secondVariable, char sign) {
		return invokeCalculations(Double.valueOf(firstVariable), Double.valueOf(secondVariable),
				null, null, sign);
	}

	public Double calculate(char sign, Double... variables) {
		return invokeCalculations(null, null, variables, null, sign);
	}

	public Double calculate(char sign, String... variables) {
		return invokeCalculations(null, null, null, variables, sign);
	}

	private Double invokeCalculations(Double firstVariable, Double secondVariable,
	                                  Double[] doublesVariables, String[] stringsVariables, char sign) {
		Double result = null;
		ParametersType parametersType = checkParametersType(firstVariable, secondVariable, doublesVariables, stringsVariables);
		switch (sign) {
			case '+':
				result = calculateByParameter(firstVariable, secondVariable, doublesVariables, stringsVariables, parametersType, addition);
				break;
			case '-':
				result = calculateByParameter(firstVariable, secondVariable, doublesVariables, stringsVariables, parametersType, subtraction);
				break;
			case '*':
				result = calculateByParameter(firstVariable, secondVariable, doublesVariables, stringsVariables, parametersType, multiplication);
				break;
			case '/':
				result = calculateByParameter(firstVariable, secondVariable, doublesVariables, stringsVariables, parametersType, division);
				break;
		}
		return result;
	}

	private Double calculateByParameter(Double firstVariable, Double secondVariable,
	                                    Double[] doublesVariables, String[] stringsVariables,
	                                    ParametersType parametersType, GenericCalculation genericCalculation) {
		Double result = null;
		if (parametersType == ParametersType.STANDARD)
			result = genericCalculation.calculate(firstVariable, secondVariable);
		else if (parametersType == ParametersType.DOUBLES)
			result = genericCalculation.calculate(doublesVariables);
		else if (parametersType == ParametersType.STRINGS)
			result = genericCalculation.calculate(stringsVariables);
		return result;
	}

	private ParametersType checkParametersType(Double firstVariable, Double secondVariable,
	                                           Double[] doublesVariables, String[] stringsVariables) {
		ParametersType parametersType = ParametersType.UNDEFINED;
		if (firstVariable != null && secondVariable != null && doublesVariables == null && stringsVariables == null)
			parametersType = ParametersType.STANDARD;
		if (doublesVariables != null)
			parametersType = ParametersType.DOUBLES;
		if (stringsVariables != null)
			parametersType = ParametersType.STRINGS;
		return parametersType;
	}
}
