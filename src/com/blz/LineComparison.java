package com.blz;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome in Line Comparison..!!!");

		// Declare and Initialize variable (x,y)coordinates.

		int x1 = 2;
		int y1 = 7;
		int x2 = 5;
		int y2 = 3;

		// Calculate length of line using given formula.

		double Lengthofline = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(
				"Length of the line" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") :" + Lengthofline);

	}

}
