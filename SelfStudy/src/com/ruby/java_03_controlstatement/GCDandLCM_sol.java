package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class GCDandLCM_sol {

	public static int gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		// 첫 회차에서는 무의미하나 반복되면서 최대공약수 값을 반환함
		else
			return gcd(n2, n1 % n2);
		/*
		 * 유클리드 호제법에 따라 위치이동 (작은수: 큰수 자리, 나머지: 작은수 자리)
		 */
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt();

		int gcd = gcd(n1, n2);
		// 위에서 정의한 gcd 메소드 활용
		int lcm = (n1*n2)/gcd;

//		System.out.println(gcd);
//		// 최대공약수
//		System.out.println(n1 * n2 / gcd);
//		// 최소공배수 : 작은수*큰수/최대공약수
		
		System.out.printf("최대공약수: %d\n",gcd);
		System.out.printf("최소공배수: %d",lcm);
	}

}

//	제어문만 활용하여 2번 반복할 방법은???