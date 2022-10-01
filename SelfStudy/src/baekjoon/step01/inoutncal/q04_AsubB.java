package baekjoon.step01.inoutncal;

import java.util.Scanner;

public class q04_AsubB {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		byte A = sc.nextByte();
		byte B = sc.nextByte();
		
		if(A>0 && A<10) {
			if(B>0 && B<10) {
				System.out.println(A-B);
			}
		}
	}

}
