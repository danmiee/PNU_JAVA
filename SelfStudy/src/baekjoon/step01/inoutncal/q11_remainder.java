package baekjoon.step01.inoutncal;

/*
 * 체스판 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8으로 구성
 * 몇개를 더하거나 빼야 올바른 세트가 되는지 확인
 * 
 *  입력 : 6개 정수 입력(0초과 10이하)
 *  출력 : 갯수 비교
 */

import java.util.Scanner;

public class q11_remainder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>=2 && a<=10000) {
			if (b>=2 && b<=10000) {
				if (c>=2 && c<=10000) {
					System.out.println((a+b)%c);
					System.out.println(((a%c)+(b%c))%c);
					System.out.println((a*b)%c);
					System.out.println(((a%c)*(b%c))%c);
				}
			}
		}
		
	}
}
