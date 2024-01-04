package com.javaoo.calculators;

public class TrigonometricCalculator {

	public final double sine(double x) {

		return Math.sin(x);

	}

	public final double cosine(double x) {

		return Math.cos(x);

	}

	public final double tangent(double x) {

		return Math.tan(x);

	}

	public final double arcsine(double x) {

		return Math.asin(x);

	}

	public final double arccosine(double x) {

		return Math.acos(x);

	}

	public final double arctangent(double x) {

		return Math.atan(x);

	}

	public static void main(String[] args) {

		TrigonometricCalculator calci = new TrigonometricCalculator();

		System.out.println(calci.sine(2));
		System.out.println(calci.cosine(2));
		System.out.println(calci.tangent(2));
		System.out.println(calci.arcsine(2));
		System.out.println(calci.arccosine(2));
		System.out.println(calci.arctangent(2));
	}
}
