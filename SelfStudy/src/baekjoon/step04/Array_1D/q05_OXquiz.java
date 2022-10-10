package baekjoon.step04.Array_1D;

import java.util.Scanner;

public class q05_OXquiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String ox;
		
		for(int i=0; i<n; i++) {	// 케이스별 반복
			int cnt =0;		// 연속정답 카운트
			int scr = 0;	// 누적점수
			ox = sc.next();			// 문자열 입력
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j)=='O') {
					cnt++;			// 연속정답 카운트
					scr = scr+cnt;	// 누적점수 계산
				} else {
					cnt=0;			// 연속정답 초기화
				}
			}
		System.out.println(scr);	
		}
	}
}
