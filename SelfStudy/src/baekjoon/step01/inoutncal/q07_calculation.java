package baekjoon.step01.inoutncal;

import java.util.Scanner;

public class q07_calculation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>=1 && A<=10000) {
				if(B>=1 && B<=10000) {
					System.out.println(A+B);
					System.out.println(A-B);
					System.out.println(A*B);
					System.out.println(A/B);
					System.out.println(A%B);
			}
		}
	}
}
