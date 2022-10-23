package com.easyspub.datastructure_05_recursive;

import java.util.Scanner;

public class FactorialEx {

	static int factorial(int n) {
		int fac = 1;
		while (n > 0)
			fac *= n--;
		return fac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");
		int x = sc.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");

		sc.close();
	}
}
