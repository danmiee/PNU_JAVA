package com.ruby.java_05_06_objectoriented;

class cylinder {

	public void getVolume(double r, double h) {
		double volume = Math.PI * r * r * h;
		System.out.printf("∫Œ«« : %.2f\n", volume);
	}

	public void getArea(double r, double h) {
		double area = (Math.PI * r * r) * 2 + (2 * Math.PI * r * h);
		System.out.printf("∞—≥–¿Ã : %.2f\n", area);
	}

}

public class CylinderTest {
	public static void main(String[] args) {
		cylinder c = new cylinder();
		c.getVolume(1, 1);
		c.getArea(1, 1);
	}

}
