package com.ruby.java_02_datauses;

import java.util.Scanner;

public class ExchangeRate {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int d = in.nextInt();
		int w = d*1350;
		
		System.out.println(w+"¿ø");
		
		in.close();
		
	}
}
