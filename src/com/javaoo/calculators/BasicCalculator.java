package com.javaoo.calculators;

public class BasicCalculator {
	private double x, y;

	public final double add(double x, double y) {

		return x + y;

	}

	public final double subtract(double x, double y) {

		return x - y;

	}

	public final double multiply(double x, double y) {

		return x * y;

	}

	public final double divide(double x, double y) {

		double ret = y == 0 ? 0 : x / y;
		return ret;

	}

	public static void main(String[] args) {

		BasicCalculator calci = new BasicCalculator();
		System.out.println(calci.add(15, 17));
		System.out.println(calci.subtract(15, 17));
		System.out.println(calci.multiply(15, 17));
		System.out.println(calci.divide(15, 0));
	}

}