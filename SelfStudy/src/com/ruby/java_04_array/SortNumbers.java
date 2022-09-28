package com.ruby.java_04_array;

import java.util.Arrays;
import java.util.Random;

public class SortNumbers {

	public static void main(String[] args) {

		int[] sort = new int[7];
		// 배열 선언
		for (int i = 0; i < sort.length; i++) {
			Random rd = new Random();
			sort[i] = rd.nextInt(46);
			// 배열요소로 랜덤 수 입력
			for (int j = 0; j < i; j++) {
				if (sort[i] == sort[j]) {
				// 배열요소 중복 시
					i--;
					// 해당 회차 배열요소 재입력
				}
			}
		}
		System.out.println("입력: "+ Arrays.toString(sort));
		
		for (int a = 0; a < sort.length; a++) {
			for (int b = a + 1; b < sort.length; b++) {
			// sort[a]와 sort[b]의 중복이 없어야하므로 b=a+1
				if (sort[a] > sort[b]) {
				// 앞뒤 요소 간 크기 비교
					int temp = sort[a];	// a번째 요소 임시보관
					sort[a] = sort[b];	// a번째 요소에 더 작은 수 넣어주기
					sort[b] = temp;		// b번째 요소에 더 큰 수 넣어주기
					// temp : 임시저장소
				}
			}
		}
		System.out.println("출력: "+ Arrays.toString(sort));
	}
}
