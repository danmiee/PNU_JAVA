package baekjoon.step06.string;

import java.util.Scanner;

public class q07_BakwordsNum {

	// 세자리 수 2개 입력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int bwnum1 = change(num1);
		int bwnum2 = change(num2);
		
		compareTo(bwnum1, bwnum2);

		sc.close();
	}
	
	// 순서 바꾸기
	public static int change(int num) {
		
		// 백의자리 수
		int a = num / 100;
		
		// 십의자리 수
		int b = (num - (a*100)) / 10;
		
		// 일의자리 수
		int c = num % 10;
		
		int bwnum = c*100 + b*10 + a; 
		
		return bwnum;
	}
	
	// 대소비교
	public static void compareTo(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		} else if(num1<num2) {
			System.out.println(num2);
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}
	
}
