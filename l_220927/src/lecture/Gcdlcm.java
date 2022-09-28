package lecture;

//import java.util.Scanner;

public class Gcdlcm {

	// 변수선언
	private int num1;
	private int num2;

	/*
	 *  변수선언을 private으로 두게 되면 Gtest(다른 클래스)에서 접근 불가
	 *  > Setter 적용 gl1
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// 생성자 선언하여 호출하는 방법 gl2
	public Gcdlcm() {
	}
	public Gcdlcm(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 유클리드호제법 - 최소공배수와 최대공약수를 구한다.
	// num1=a, num2=b
	public void print() {
		int max, min;

		// max, min값 구분
		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}

		int rem = max % min;

		// 유클리드 호제법 적용 및 서로소 구분
		while (rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
			if (min == 1) {
				System.out.println("최대공약수 : 서로소");
			} else {
				System.out.println("최대공약수 :" + min);
			}
			System.out.println("최소공배수: " + (num1 * num2) / min);
		}
	}
}
