package baekjoon.step03.loop;

import java.util.Scanner;

public class q01_MultiplicationTable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}

}
