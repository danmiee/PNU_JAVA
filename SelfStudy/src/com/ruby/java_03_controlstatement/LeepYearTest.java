package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class LeepYearTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int year;

		System.out.printf("[À±³â°Ë»ç]\nÁ¾·á:0\n");

		while ((year = in.nextInt()) != 0) {
			String result = 
					(year % 4 == 0) ? 
							((year % 100 != 0) ? "À±³â" : 
										((year % 400 == 0) ? "À±³â" : "Æò³â")
							) :"Æò³â";
			
			System.out.printf("%d³â => %s",year,result);
		}
		System.out.println("Good bye!!");
	}

}
