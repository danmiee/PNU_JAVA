package baekjoon.step03.loop;

import java.util.Scanner;

public class q12_AplusBloop_eof {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum=a+b;
			
			System.out.println(sum);
		}
	}
}
