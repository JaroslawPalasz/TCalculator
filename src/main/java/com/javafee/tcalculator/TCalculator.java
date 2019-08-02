package com.javafee.tcalculator;

import java.util.Scanner;

import com.javafee.engine.Addition;
import com.javafee.engine.Calculation;

public class TCalculator {
	public static void main(String[] args) {
		Calculation example = new Addition();
		System.out.println(example.calculate(2.0, 2.0));

		Scanner input = new Scanner(System.in);
		System.out.print("Podaj pierwsza zmienna: ");
		String firstInput = input.next();

		System.out.print("Podaj druga zmienna: ");
		String secondInput = input.next();

		System.out.print("Podaj kolejną zmienna: ");
		String thirdInput = input.next();

		com.javafee.kengine.Calculation calculation = new com.javafee.kengine.Calculation();
		System.out.println(calculation.calculate('+', Double.valueOf(firstInput), Double.valueOf(secondInput), Double.valueOf(thirdInput)));
		//		System.out.println(calculation.calculate(2.0, 4.0, '*'));
		//		System.out.println(calculation.calculate(2.0, 4.0, '-'));
		//		System.out.println(calculation.calculate(2.0, 0.0, '/'));
	}
}
