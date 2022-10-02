package baekjoon.step03.loop;

import java.util.Scanner;

public class q02_AplusBloop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tnum = sc.nextInt();
		int a, b;
		
		for(int i = 1; i<=tnum; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}

}
