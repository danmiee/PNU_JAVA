package baekjoon.step04.Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class q04_Average {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		double sum = 0;

//[¿À´ä]
//		int max = 0;
//		for (int i = 0; i < n; i++) {
//			if (n == 1) {
//				max = score[0];
//			} else {
//				for (int j = i + 1; j < n; j++) {
//					max = (score[i] < score[j]) ? score[j] : score[i];
//				}
//			}
//		}

		Arrays.sort(score);
//		System.out.println(Arrays.toString(score));
		
		for (int i = 0; i < n; i++) {
			sum += (double) score[i] / score[n-1] * 100;
		}

		double avg = sum / n;

//		System.out.println(max);
//		System.out.println(Arrays.toString(fake));
//		System.out.println(sum);
		System.out.println(avg);
	}
}
