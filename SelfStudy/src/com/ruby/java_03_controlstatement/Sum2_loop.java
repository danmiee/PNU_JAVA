package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class Sum2_loop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("[숫자 입력 시 합(전체/홀수/짝수) 계산]");
		
		int i, j, k, inputN;

		while ((inputN = in.nextInt()) != 0) {

			int sum = 0;
			int oddsum = 0;
			int evensum = 0;

			for (i = 0; i <= inputN; i++) {
				sum += i;
			}
			for (j = 0; j <= inputN; j++) {
				if(j%2 == 1) {
					oddsum += j;
				}
			}
			for (k = 0; k <= inputN; k++) {
				if(k%2 == 0) {
					evensum += k;
				}
				continue;
			}
			System.out.println("전체 합 : " + sum);
			System.out.println("홀수 합 : " + oddsum);
			System.out.println("짝수 합 : " + evensum);
		}

		System.out.println("Good bye!!");

		in.close();
	}

}
