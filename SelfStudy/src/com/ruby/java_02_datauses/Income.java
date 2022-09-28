package com.ruby.java_02_datauses;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		
		int inc1, inc2, inc3, inc4, inc5, inc6, inc7;

		Scanner in = new Scanner(System.in);
		
//		inc1 = in.nextInt();
//		inc2 = in.nextInt();
//		inc3 = in.nextInt();
//		inc4 = in.nextInt();
//		inc5 = in.nextInt();
//		inc6 = in.nextInt();
//		inc7 = in.nextInt();
		
		inc1 = 10000;
		inc2 = 10000;
		inc3 = 10000;
		inc4 = 10000;
		inc5 = 10000;
		inc6 = 10000;
		inc7 = 10000;
		
		int sum = inc1+inc2+inc3+inc4+inc5+inc6+inc7;
		int avg = (inc1+inc2+inc3+inc4+inc5+inc6+inc7)/7;

		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.printf("총 수입 : %s원\n"+"일 평균 수입: %s원\n"
				,df.format(sum),df.format(avg));
		
		in.close();
	}
}
