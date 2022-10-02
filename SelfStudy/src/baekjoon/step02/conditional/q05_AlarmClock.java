package baekjoon.step02.conditional;

import java.util.Scanner;

public class q05_AlarmClock {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = h1;
		int m2 = (m1-45);
		
		if((h1>=0 && h1<=23) && (m1>=0 && m1<=59)) {
			if(m2<0) {
				h2 = h1-1;
				m2 = 60+m2;
				if(h2<0) {
					h2 = 24+h2;
					System.out.printf("%d %d",h2,m2);
				} else {
					System.out.printf("%d %d",h2,m2);
				}
			} else {
				System.out.printf("%d %d",h2,m2);
			}
		}
		
	}

}
