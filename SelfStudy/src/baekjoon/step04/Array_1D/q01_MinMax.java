package baekjoon.step04.Array_1D;

import java.util.Scanner;

public class q01_MinMax {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int N[] = new int[n];

		for (int i = 0; i < n; i++) {
			N[i] = sc.nextInt();
		}

		int min = N[0];
		int max = N[0];
		
		for (int i = 0; i < n; i++) {
			if (min >= N[i]) {
				min = N[i];
			}
			if (max <= N[i]) {
				max = N[i];
			}
		}
		System.out.println(min + " " + max);

	}
}
