package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class PrimeNumber {

	/*
	 * 소수 판단 소수 : 1과 자기자신을 제외한 수로 나누었을 때 나머지가 0이 아니다 조건문 - 나머지가 0이다 break; 판단 > 자기자신
	 * : 소수 / 자기자신 X : 소수아님 반복문 - 2~9로 나누기
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int inputN, i;
		inputN = in.nextInt();
		
			for (i = 2; i <= inputN; i++) {
				if (inputN % i != 0) {
					
				} else if (inputN == i) {
					System.out.println("소수입니다."); break;
				} else {
					System.out.println("소수가 아닙니다."); break;
				}
			}

	}
}
