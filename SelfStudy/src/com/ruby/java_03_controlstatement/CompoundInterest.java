package com.ruby.java_03_controlstatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("%");
		
		int a, n;
		double r = 0.03;
		
		
		a = in.nextInt();
		n = in.nextInt();
		
		int S = (int) (a * Math.pow(1+r, n));
		
		System.out.printf(
				"원금: %d원, 만기: %d년, 연복리: %s\n"
				+ "만기 금액 : %d원",a,n,df.format(r),S);
	}
}

// 거듭제곱 : math.pow(제곱대상,제곱수)