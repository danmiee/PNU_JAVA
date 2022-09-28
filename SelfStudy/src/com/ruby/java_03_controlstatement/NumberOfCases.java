package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class NumberOfCases {

/*
 * 2g, 3g, 5g 추 10개를 사용하여 10~100 사이 정수 표현하는 경우의 수 구하기
 * (추는 각 1개 이상 사용)
 * - 반복문 활용 / 3개 중첩
 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("[추의 합이 되는 값을 입력하세요.]");
		System.out.println("-종료:0-");
		
		Scanner in = new Scanner(System.in);
		
		int n;
		while((n=in.nextInt())!=0) {
			
			if(n<10 || n>100) {
				System.out.println("10~100 사이 정수를 입력해주세요.");
				break;
			}
			System.out.println("입력값: "+n);
			int i,j,k,count;
			count = 0;
			for(i=1; i<=10; i++) {
				for(j=1; j<=10; j++) {
					for(k=1; k<=10; k++) {
						if(2*i+3*j+5*k==n) {
							count++;
							System.out.printf("(%d,%d,%d)",i,j,k);
						}
					}
				}
			} System.out.printf("\n경우의수: %d개",count);
		}
		System.out.println("Good bye!!");
	}

}
