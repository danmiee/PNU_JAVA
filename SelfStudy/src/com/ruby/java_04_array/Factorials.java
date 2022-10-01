package com.ruby.java_04_array;

import java.util.Scanner;

public class Factorials {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[숫자를 입력하면 팩토리얼 값을 계산합니다.]");
		System.out.println("- 종료 : 0 -");
		
		int inputN;
		
		while((inputN = sc.nextInt()) != 0) {
			
			System.out.print(inputN + "! = ");
			
			int fac = 1;
			for(int j=inputN; j>=1; j--) {
				fac = fac * j;
				if(j>1) {
					System.out.print(j + "*");
				} else {
					System.out.println("1 = " + fac);
				}
			}
			
		}
		System.out.println("수고하셨습니다.");
	}

}
