package com.ruby.java_04_array;

import java.util.Scanner;

public class Transform {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println(">> Input three Numters(x1 y1 angle)");

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double angle = sc.nextDouble();
		double x2, y2;

			double rad = Math.toRadians(angle);
			x2 = x1 * Math.cos(rad) - y1 * Math.sin(rad);
			y2 = x1 * Math.sin(rad) + y1 * Math.cos(rad);

			System.out.printf("입력값: (%d,%d) %.1f도\n", x1, y1, angle);
			System.out.printf("이동 후 좌표: (%.0f,%.0f)", x2, y2);

	}

}
