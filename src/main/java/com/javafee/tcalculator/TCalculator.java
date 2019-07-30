package com.javafee.tcalculator;

import com.javafee.engine.Addition;
import com.javafee.engine.Calculation;

public class TCalculator {
	public static void main(String[] args) {
		Calculation example = new Addition();
		System.out.println(example.calculate(2.0, 2.0));

		com.javafee.kengine.Calculation calculation = new com.javafee.kengine.Calculation();
		System.out.println(calculation.calculate(2.0, 2.0, '+'));
	}
}
