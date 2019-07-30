package com.javafee.kengine;

public class Calculation {
	private GenericCalculation addition = new Addition();
	private Double result = null;

	public Double calculate(Double firstVariable, Double secondVariable, char sign) {
		switch (sign) {
			case '+':
				result = addition.calculate(firstVariable, secondVariable);
				break;
		}
		return result;
	}
}
