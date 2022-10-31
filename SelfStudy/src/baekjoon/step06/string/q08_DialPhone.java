package baekjoon.step06.string;

import java.util.Scanner;

public class q08_DialPhone {
	
	// 입력된 알파벳별 숫자 확인하기
	//switch-case?
	public static int[] confirm(String str) {
		
		int[] arr = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)<68)
				arr[i] = 3;
			else if(str.charAt(i)<71)
				arr[i] = 4;
			else if(str.charAt(i)<74)
				arr[i] = 5;
			else if(str.charAt(i)<77)
				arr[i] = 6;
			else if(str.charAt(i)<80)
				arr[i] = 7;
			else if(str.charAt(i)<84)
				arr[i] = 8;
			else if(str.charAt(i)<87)
				arr[i] = 9;
			else
				arr[i] = 10;
		}
		return arr;
	}
	
	// 확인된 숫자 더하기
	public static int plus(int[] arr) {
		int sum = 0;
		for(int s : arr) {
			sum += s;
		}
		return sum;
	}

	// 단어 입력받기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(plus(confirm(str)));
		
		sc.close();
	}
}
