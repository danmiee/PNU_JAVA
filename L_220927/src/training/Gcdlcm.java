package training;
/*
 * 클래스 만들기
 * 숫자 2개 입력받기
 * 최대공약수 출력
 * 최소공배수 출력
 */

import java.util.Scanner;

class Gcd {
	// 클래스 정의
	public static int gcd(int min, int max) {
		/*
		 *  재귀호출 : 자기자신을 호출하는 것
		 *  .. 잘못쓰면 무한루프!!
		 *  여기서는 min이 max보다 큰 경우
		 *  max / min = 0...min
		 *  ㄴ 큰 수로 작은수를 나눌 수 없으므로 나머지가 항상 min
		 */ 
		int rem = max % min;
		// 최대공약수를 구하는 메소드 정의
		if (rem == 0) {
			return min;
			// y%x=0이면 x=최대공약수, y=최소공배수
		} else {
			return gcd(rem, min);
			// rem이 0이 아니면 y=x, x=y%x 반환
		}
	}
}

public class Gcdlcm {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2개의 정수를 입력하면 최대공약수와 최소공배수를 출력합니다.");
		System.out.println("종료를 원하시면 0을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int x, y;
		while ((x = sc.nextInt()) != 0) {
			y = sc.nextInt();

			System.out.println("입력값: " + x + "," + y);
			System.out.println("최대공약수: " + Gcd.gcd(x, y));
			System.out.println("최소공배수: " + x * y / Gcd.gcd(x, y));
		}

		System.out.println("수고하셨습니다.");
	}

}