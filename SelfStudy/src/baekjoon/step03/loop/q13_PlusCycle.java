package baekjoon.step03.loop;

import java.util.Scanner;

public class q13_PlusCycle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int copy = n;
		int count = 0;
		
		while(true) {
			n=((n%10)*10)+(((n/10)+(n%10))%10);
			count++;
			
			if(copy==n) {
				break;
			}
		}
		
		System.out.println(count);
		
	}
}
