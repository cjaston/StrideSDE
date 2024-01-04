package com.javaoo.calculators;

public class ScientificCalculator {
	private static final double PI = 3.14159;

	private double holdValue;

	public final double exp(double x) {

		return Math.pow(2.718281828459045, x);

	}

	public final double log(double x) {

		return Math.log(x);

	}

	public final void putValueInMemory(double x) {

		holdValue = x;

	}

	public final double getValueFromMemory() {

		return holdValue;

	}

	public static void main(String[] args) {

		ScientificCalculator calci = new ScientificCalculator();

		calci.putValueInMemory(15);
		System.out.println(calci.exp(2));
		System.out.println(calci.log(4));
		System.out.println(calci.getValueFromMemory());
		System.out.println(PI);
	}
}
