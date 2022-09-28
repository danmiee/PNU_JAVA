package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class CompoundInterest_loop {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int a, n;
		double r = 0.03;
		
		System.out.println("[원금과 거치기간을 입력하면 만기금액을 계산합니다.(연복리 3% 기준)]");
		System.out.println("---종료를 원하시면 0을 입력하세요.---");
		
		while((a = in.nextInt()) != 0) {
			n = in.nextInt();
			
			int S = (int) (a * Math.pow(1+r, n));
			
			System.out.printf(
					"원금: %d원, 만기: %d년\n"
					+ "만기 금액 : %d원",a,n,S);
			
		}
		
		System.out.println("수고하셨습니다.");
	}
}

// 거듭제곱 : math.pow(제곱대상,제곱수)