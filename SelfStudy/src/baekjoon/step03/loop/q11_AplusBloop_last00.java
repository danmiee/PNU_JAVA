package baekjoon.step03.loop;

import java.util.Scanner;

public class q11_AplusBloop_last00 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(((a=sc.nextInt())!=0)&&((b=sc.nextInt())!=0)) {
			System.out.println(a+b);
		}
	}
}
