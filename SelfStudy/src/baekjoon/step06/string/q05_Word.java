package baekjoon.step06.string;

import java.util.Scanner;

public class q05_Word {

	public static void main(String[] args) {

		// 대소문자로 이루어진 단어 입력받기
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] strArray = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			strArray[i] = String.valueOf(str.charAt(i));
		}

		// 가장 많이 사용된 알파벳 확인
		int[] cnt = new int[strArray.length];
		for (int i=0; i<strArray.length; i++) {
			cnt[i] = 1;
		}

		for (int i = 0; i < strArray.length; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				// 대소문자 구분없이 비교
				if (strArray[i].equalsIgnoreCase(strArray[j])) {
					++cnt[i];
				}
			}
		}

		// cnt의 max 값 찾기
		int max = 0;
		String res = "";
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				res = strArray[i];
			} else if (max == cnt[i]) {
				res = "?";
			}
		}

		System.out.println(res.toUpperCase());

		sc.close();
	}
}
