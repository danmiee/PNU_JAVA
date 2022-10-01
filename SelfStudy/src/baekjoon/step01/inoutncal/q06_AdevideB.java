package baekjoon.step01.inoutncal;

import java.util.Scanner;

public class q06_AdevideB {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>0 && A<10) {
				if(B>0 && B<10) {
					System.out.println((double)A/B);
			}
		}
	}
}
