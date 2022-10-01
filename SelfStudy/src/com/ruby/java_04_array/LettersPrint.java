package com.ruby.java_04_array;

import java.util.Scanner;

/*
 * 모음: A,E,I,O,U
 * 문자열의 자음과 모음 개수 출력
 * toCharArray : 문자열을 문자 배열로 만드는 String의 메소드 
 */

public class LettersPrint {

	// 모음 지정 배열
//	vowel(c) 리턴값 : 숫자		
/*
 * 	리턴값
 * 0 : 자음
 * 1 : 모음
 * 2 : 숫자
 * 3 : 그 외
 */
	private static int vowel(char c) {
		// 숫자면
		if(c>=48 && c<=57) {
			return 2;
			// 문자면
		} else if((c>=65 && c<=90) || (c>=97 && c<=122)) {
			// 모음이면
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				return 1;
			} 
			// 그렇지 않으면
			return 0;
		} 
		// 그외(숫자도 문자도 아님)이면
		return 3;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");

		// 문자열 입력받기
		String str = sc.next();

		// 결과값 배열
		int [] res = new int[4];
		
		// 입력받은 문자열을 문자 배열로 만들기
		char[] arr = str.toCharArray();
		// 문자배열 요소 하나씩 반복문
		for(char c : arr) {
			// 모음인지 확인하기
			int ret = vowel(c);	// ★★★ 함수호출 익히기
			res[ret]++;
		}

		System.out.printf("자음: %d개\n",res[0]);
		System.out.printf("모음: %d개\n",res[1]);
		System.out.printf("숫자: %d개\n",res[2]);
		System.out.printf("그 외: %d개\n",res[3]);
		
	}

}
