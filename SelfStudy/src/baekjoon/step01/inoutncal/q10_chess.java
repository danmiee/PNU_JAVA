package baekjoon.step01.inoutncal;

/*
 * 체스판 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8으로 구성
 * 몇개를 더하거나 빼야 올바른 세트가 되는지 확인
 * 
 *  입력 : 6개 정수 입력(0초과 10이하)
 *  출력 : 갯수 비교
 */

import java.util.Scanner;

public class q10_chess {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x1 = 1-sc.nextInt();
		int x2 = 1-sc.nextInt();
		int x3 = 2-sc.nextInt();
		int x4 = 2-sc.nextInt();
		int x5 = 2-sc.nextInt();
		int x6 = 8-sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d",x1,x2,x3,x4,x5,x6);
	}

}
