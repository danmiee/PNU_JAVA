package baekjoon.step07.math;

import java.util.Scanner;

public class q02_Honeycomb {

	static int min(int num) {
		// 지나는 방의 최소개수 초기값 1
		int cnt = 1;
		// 범위 시작값의 초기값 2
		int range = 2;
		// 방 번호가 1이면 방 개수 1
		if(num == 1)
			return 1;
		// 방 번호가 1이 아니면
		else {
			// 범위 시작값이 방 번호보다 작거나 같은 동안 반복
			while(range<=num) {
				// 사이클이 늘어날 때마다 범위 시작값 6개씩 증가
				range += 6*cnt;
				// 지나는 방의 최소개수 +1
				cnt++;
			}
		}
		// 지나는 방의 최소개수 리턴
		return cnt;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하면 지나는 방의 최소 개수를 구합니다.(종료: 0)");
		// 방 번호 입력
		int N;
		while((N=sc.nextInt())!=0) {
		System.out.println(min(N));
		}
		sc.close();
	}
}
