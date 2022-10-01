package baekjoon.step01.inoutncal;

import java.util.Scanner;

public class q09_BuddhaEra {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if(y>=1000 && y<=3000) {
			System.out.println(y-543);
		}
	}

}
