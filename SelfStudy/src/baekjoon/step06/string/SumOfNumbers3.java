package baekjoon.step06.string;

import java.util.Scanner;

class SNsub {
	// num3s 생성 : 입력받은 num2를 num1개만큼 자르기
	public String getNum2(int num1, long num2) {
		String num2s = String.valueOf(num2);
		String num3s = "";
		if(num2s.length()<num1) {
			System.out.println("너무 짧습니다.");
		} else {
			num3s = num2s.substring(0, num1);
		}
		return num3s;
	}
	public void print(String num3s) {
		int sum = 0;
		for(int i=0; i<num3s.length(); i++) {
			sum += Integer.parseInt(num3s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}

public class SumOfNumbers3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		long num2 = sc.nextLong();

		SNsub sb = new SNsub();
		String str = sb.getNum2(num1, num2);
		sb.print(str);
	}
}
