package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int inputN = in.nextInt();

		System.out.print("전체 합 : ");
		for (int i = 1; i <= inputN; i++) {
			System.out.print(i);
			if (i < inputN)
				System.out.print("+");
			else
				System.out.print("=");
		}

		int j = 0, sum = 0;
		do {
			j++;
			sum += j;
		} while (j < inputN);
		System.out.println(sum);

		System.out.println("홀수 합 : ");
		for (int k = 1; k <= inputN; k = k + 2) {
			System.out.print(k);
			if (inputN % 2 == 1) {
				if (k < inputN) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}
			} else {
				if (k < (inputN - 1)) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}
			}
		}

		in.close();
	}

//	반복문 이해 및 추가 공부 필요

}
