package baekjoon.step06.string;

import java.util.Scanner;

public class q06_WordCount {

	public static int count(String str) {
		
		String[] arr = str.split(" ");
		int cnt = arr.length;
		
		// 아무것도 입력하지 않은 경우
		if(arr.length == 0) {
			System.out.println(0);
			System.exit(0);			// 프로그램 강제종료
		}
			
		if(arr[0].equals(""))
			cnt--;
		else
			return cnt;
		
		// 마지막 스페이스는 컴파일러가 배열에 포함시키지 않으므로 불필요
//		if(arr[arr.length-1].equals(""))
//			cnt--;
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(count(str));
		
		sc.close();
	}
}
