package baekjoon.step06.string;

import java.util.Scanner;

class Repeat {
	
	public void show(int rpnum, String str) {
		// str.charAt()을 rpnum만큼 반복하여 출력하기
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<rpnum; j++) {
				System.out.print(str.charAt(i));
			}
		}System.out.println();
	}
	
}

public class q04_RepeatString2 {

	public static void main(String[] args) {
		// 테스트 할 케이스의 개수 입력받기 (csnum)
		Scanner sc = new Scanner(System.in);
		int csnum = sc.nextInt();
		// csnum만큼 반복문 적용
			// 각 테스트 케이스의 반복횟수 입력받기 (rpnum)
			// 문자열 입력받기 (str)
		int rpnum;
		String str;
		
		Repeat rp = new Repeat();
		
		for(int i=0; i<csnum; i++) {
			rpnum = sc.nextInt();
			str = sc.next();
			rp.show(rpnum, str);
		}
		sc.close();
	}
}
