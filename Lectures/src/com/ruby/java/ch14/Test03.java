package com.ruby.java.ch14;

interface Verify {
	boolean check(int n);
}

interface Verify1_2 {
	boolean check(int n, int d);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.check(10));
		
		Verify isOdd = (n) -> (n % 2) !=0;
		System.out.println(isOdd.check(10));

		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(10));
		
		Verify isNegative = (n) -> n < 0;
		System.out.println(isNegative.check(0));
	
		Verify1_2 Drainage = (n,d) -> (n%d) == 0;
		System.out.println(Drainage.check(6, 3));
		
	}
}
