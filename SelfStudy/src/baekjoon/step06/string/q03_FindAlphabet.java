package baekjoon.step06.string;

import java.util.Scanner;

public class q03_FindAlphabet {

	// 알파벳별 단어 내 위치 확인(없으면 -1)
	public static void show(String str) {
		char[] abc = {'a','b','c','d','e','f','g','h',
				'i','j','k','l','m','n','o','p','q',
				'r','s','t','u','v','w','x','y','z'};
		for(char c : abc) {
			System.out.print(str.indexOf(c)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		// 소문자로 이루어진 단어 입력받기(str)
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		show(str);
	}
}
