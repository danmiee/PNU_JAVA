package baekjoon.step06.string;

import java.util.Scanner;


public class q02_SumOfNumbers2 {

	// 프로세싱 메소드
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
	
		// num3를 한자리씩 더하기
	public static void print(String num3s) {
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
			System.out.println(sum);
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		long num2 = sc.nextLong();

		String num3s = getNum2(num1, num2);
		
		print(num3s);
	}
}
