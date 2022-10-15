package baekjoon.step06.string;

import java.util.Scanner;

public class q02_SumOfNumbers_sol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		
        // num2는 num1만큼의 숫자로 입력한다고 문제에서 주어졌기 때문에 String으로 입력받아도 무방한 것으로 사료됨
		String num2 = sc.next();
		int sum = 0;
        
		for(int i=0; i<num1; i++) {
			sum += num2.charAt(i)-'0';
			// 문자열 내 인덱스로 캐릭터값 가져오기 > 아스키코드로 계산됨
			// 숫자로 입력되므로 0을 빼면 입력된 숫자값과 같은 값을 얻을 수 있음
		}
		
		System.out.println(sum);
        sc.close();
        // memory leak 방지
	}
}
