package baekjoon.step07.math;

import java.util.Scanner;

public class q02_Honeycomb {

	static int min(int num) {
		int cnt = 1;
		int rangeM = 2;
		if(num == 1)
			return 1;
		else {
			while(rangeM<=num) {
				rangeM += 6*cnt;
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하면 지나는 방의 최소 개수를 구합니다.(종료: 0)");
		int N;
		while((N=sc.nextInt())!=0) {
		System.out.println(min(N));
		}
		sc.close();
	}
}
