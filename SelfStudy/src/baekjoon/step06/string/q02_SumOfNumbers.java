package baekjoon.step06.string;

import java.math.BigInteger;
import java.util.Scanner;

public class q02_SumOfNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//
//		// 숫자 2개 입력받음
//		
//		// num1 : num2에 기재된 숫자의 갯수		
//		
//		// num2를 문자열로 받아서 배열로 변환?
//		int[] arr = new int [num1];
//		XXX
//		substring으로 잘라내면 됨
		
	
		// 숫자 1개 입력받기(num1)
		int num1 = sc.nextInt();
		
		// 숫자 1개 더 입력받기(num2)
			// int로 입력
		BigInteger num2 = sc.nextBigInteger();
		String num2s = String.valueOf(num2);
		if(num2s.length()<num1) {
			System.out.println("너무 짧습니다.");
			return;
		}
		// 입력된 수 중 앞에서부터 num1개만 받아오기(num3)
		String num3s = num2s.substring(0, num1);
		
		// num3를 하나씩 더하기
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
		}
		
		// 출력
		System.out.println(sum);
	}
}
