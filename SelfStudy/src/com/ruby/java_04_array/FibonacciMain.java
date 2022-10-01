package com.ruby.java_04_array;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMain {
	
	public static int fibo(int n) {	
		if (n <= 1)		return n;
		else			return fibo(n-2) + fibo(n-1);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println(">> Input a Number (Quit : 0)");

		while ((num = sc.nextInt()) != 0) {

			int fb [] = new int[num+1];
			
			for(int i=1; i<=num; i++) {
				fb[i] = fibo(i);
			}
			System.out.println("ÀÔ·Â°ª: "+num);
			System.out.println(Arrays.toString(fb));
		}
		System.out.println(">>Good Bye!!!");
	}
}