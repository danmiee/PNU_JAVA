package baekjoon.step04.array_1D;

import java.util.Scanner;

public class q06_OverAverage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0; i<c; i++) {		// 케이스 개수만큼 반복
			int n = sc.nextInt();		// 학생 수
			int [] scr = new int[n];	// 학생별 점수
			int sum = 0;				// 합계점수
			double avg = 0;				// 평균점수
			int cnt = 0;				// 평균이상 학생 수
			double percent = 0;			// 평균이상 학생 비율
			
			for(int j=0; j<n; j++) {
				scr[j] = sc.nextInt();
				sum += scr[j];
				avg = sum/n;			// 평균점수
			}
			for(int j=0; j<n; j++) {				
				if(scr[j]>avg) {
					cnt++;				// 평균넘는 학생 수
				}
			}
			percent = (double) cnt/n*100;
			System.out.println(String.format("%.3f", percent) + "%");
		}
	}
}
