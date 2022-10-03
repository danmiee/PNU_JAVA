package baekjoon.step04.Array_1D;

import java.util.Scanner;

public class q02_Maximum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N [] = new int [9];
		
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		int max = N[0];
		int maxIndex = 0;
		
		for(int i=0; i<N.length; i++) {
			if(N[i]>=max) {
				max=N[i];
				maxIndex=i+1;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
	}
}
