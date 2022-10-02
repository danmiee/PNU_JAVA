package baekjoon.step03.loop;

import java.util.Scanner;

public class q04_Receipt {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rc_sum = sc.nextInt();
		int rc_num = sc.nextInt();
		int a = 0;
		int b = 0;
		int sum = 0;
		
		for(int i=1; i<=rc_num; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a*b; 
		}
		if(sum == rc_sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
				
	}

}
