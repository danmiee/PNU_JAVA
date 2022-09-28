package lecture;

import java.util.Scanner;

public class Gtest {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 자바는 기본적으로 Object 클래스를 상송받는다.
		Object o = new Object();
			// 설명을 위해 적은 것. jdk가 설치되어있으면 내용을 볼 수 있다.
		
		// 유저와의 인터페이싱을 위한 입력문
		System.out.println("A: ");
		int a = sc.nextInt();
		System.out.println("B: ");
		int b = sc.nextInt();

		// 클래스 사용방법이므로 현재 작성된 코드 중 가장 중요한 부분 ★★★
		Gcdlcm gl1 = new Gcdlcm();
		gl1.setNum1(a);
		gl1.setNum2(b);

		Gcdlcm gl2 = new Gcdlcm(a, b);
		gl2.print();

	}
}
