package com.blz;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome in Line Comparison..!!!");

		// Declare and Initialize variable (x,y)coordinates.

		int x1 = 2, y1 = 7, x2 = 5, y2 = 3;
		int x11 = 2, y11 = 7, x12 = 5, y12 = 3;

		// Calculate length of line using given formula.

		double Lengthofline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double Lengthofline2 = Math.sqrt(Math.pow((x12 - x11), 2) + Math.pow((y12 - y11), 2));

		System.out.println(
				"Length of the line" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") :" + Lengthofline1);
		System.out.println(
				"Length of the line" + "(" + x11 + "," + y11 + ")," + "(" + x12 + "," + y12 + ") :" + Lengthofline2);

		if (Lengthofline1 == Lengthofline2)
			System.out.println("Both Two lines are equal");
		else
			System.out.println("Both Two lines are not equal");
	}
}
