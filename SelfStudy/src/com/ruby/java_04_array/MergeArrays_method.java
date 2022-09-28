package com.ruby.java_04_array;

import java.util.Arrays;
import java.util.Scanner;

class Getmerge {

	int n;

	public void merge(int n) {
		this.n = n;

		int[] A = new int[n];
		int[] B = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 10);
		}
		/*
		 * Math.random : 실수형 랜덤숫자 반환 원하는 자리수만큼 곱한 뒤 int형으로 변환함으로써 소수점단위 자동 절삭
		 */
		for (int j = 0; j < B.length; j++) {
			B[j] = (int) (Math.random() * 10);
		}
		
//		0&짝수 인덱스는 A값, 홀수 인덱스는 B값 불러오기
		int[] C = new int[n * 2];

		for (int k = 0; k < C.length; k += 2) {
			// 한번 돌릴 때 2개의 값 가져오기
			C[k] = A[k / 2];
			C[k + 1] = B[k / 2];
			// 0 포함 짝수 인덱스는 A값, 홀수 인덱스는 B값
		}

		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
		System.out.println("Merge: " + Arrays.toString(C));
	}

}

public class MergeArrays_method {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		
		System.out.println("배열의 크기를 입력하면 2개의 랜덤 배열과 두 배열의 머지값을 출력합니다.");
		System.out.println("확인이 끝나면 0을 눌러주세요.");
		
		while((n= sc.nextInt())!=0) {

		Getmerge m = new Getmerge();
		m.merge(n);

		}

		System.out.println("수고하셨습니다.");
	}
}
