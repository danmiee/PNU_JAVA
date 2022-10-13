package baekjoon.step04.array_1D;

import java.util.Scanner;

public class q03_Remainder_ing {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N[] = new int[10];

		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt() % 42;
		}
//		System.out.println(Arrays.toString(rN));

		int cnt = 0;
		for (int i = 0; i < N.length; i++) {
			int temp = 0;
			for (int j = i+1; j < N.length; j++) {
				if (N[i] == N[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}