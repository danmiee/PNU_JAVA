package baekjoon.step06.string;

import java.util.Scanner;

class SNsub2 {
	// num3s 생성 : 입력받은 num2를 num1개만큼 자르기
	public static String getNum2(int num1, long num2) {
		String num2s = String.valueOf(num2);
		String num3s = "";
		if(num2s.length()<num1) {
			System.out.println("너무 짧습니다.");
		} else {
			num3s = num2s.substring(0, num1);
		}
		return num3s;
	}
	public static void print(String num3s) {
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}

public class SumOfNumbers4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		long num2 = sc.nextLong();

		String str = SNsub2.getNum2(num1, num2);
		SNsub2.print(str);
		// static으로 선언된 경우 클래스명을 객체로 메소드 바로 호출
	}
}
