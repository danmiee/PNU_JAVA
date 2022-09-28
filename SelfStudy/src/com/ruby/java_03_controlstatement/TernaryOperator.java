package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class TernaryOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * 국영수 점수 입력 > 평균 70 이상 > 통과
		 * 1과목이라도 60점 미만이면 과락
		 */
		
		Scanner in = new Scanner(System.in);
		int k, e, m;
		
		System.out.println("[국영수 점수를 순서대로 입력하세요.]");
		System.out.println("-입력이 완료되면 0을 입력하세요.-");
		
		while((k = in.nextInt()) != 0) {
			e = in.nextInt();
			m = in.nextInt();
			
			int sum = k+e+m;
			double avg = (k+e+m)/3;
			String result;
			
//			if(avg>=70 && (k>=60 && e>=60 && m>=60)) {
//				result = "통과";
//			} else if(avg>=70 && (k<60 || e<60 || m<60)) {
//				result = "과락";
//			} else {
//				result = "탈락";
//			}
			
			result = (avg>=70 && (k>=60 && e>=60 && m>=60)) ? "통과" : 
				(result = (avg>=70) ? "과락" : "탈락");
			
			System.out.printf("입력: %d,%d,%d / 총계:%d / 평균:%.2f > %s", k,e,m,sum,avg,result);
		}
		System.out.println("수고하셨습니다.");
	}

}
