package baekjoon.step06.string;

import java.util.Scanner;

public class q05_WordIncodingValue2 {

	public static int[] count(String str) {

		// 알파벳길이 배열 생성
		int[] abc = new int[26];
		
		// str 돌면서 해당하는 index값 +1
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				abc[str.charAt(i) - 65]++;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				abc[str.charAt(i) - 97]++;
			} else {
				System.out.println("영문자를 입력해주세요.");
			}
		}
		return abc;
	}
	
	public static void print(int[] abc) {
		
		// max 값 찾기
		int max = -1;
		char res = '?';
		
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > max) {
				max = abc[i];
				res = (char) (i + 65);
			} else if (abc[i] == max) {
				res = '?';
				// break 넣어서 틀림 > break하면 알파벳 모두 확인이 안됨
			}
		}
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {

		// 아스키코드 활용하기
		// 대문자: 65~90
		// 소문자: 97~122

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		print(count(str));

		sc.close();
	}
}
