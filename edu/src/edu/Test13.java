package edu;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 0b00010001;
		byte b = 0b00100010;
		System.out.println(a);
		System.out.println(b);
		
		int c = a & b;
		System.out.println(Integer.toBinaryString(c));
		int d = a | b;
		System.out.println(Integer.toBinaryString(d));
		int e = a ^ b;
		System.out.println(Integer.toBinaryString(e));

		int f = 12;
		int g = (~f)+1;
		System.out.println(g);
		
		int h = f << 1;
		int i = f >> 1;
		System.out.println(h);
		System.out.println(i);
		
	}

}
