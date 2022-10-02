package baekjoon.step02.conditional;

import java.util.Scanner;

public class q06_OvenClock_ing {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int t = sc.nextInt();
		int ht = (int) t/60;
		int mt = t-(60*ht);
		int h2 = h1+ht;
		int m2 = m1+mt;
		
		if((h1>=0 && h1<=23) && (m1>=0 && m1<=59) && (t>=0 && t<=1000)) {
			if(m2<60) {
				if(h2<24) {
					System.out.println(h2 + " " + m2);
				} else {
					h2 = h2-24;
					System.out.println(h2 + " " + m2);
				}
			} else {
				m2 = m2-60;
				h2 = h2+1;
				if(h2<24) {
					System.out.println(h2 + " " + m2);
				} else {
					h2 = h2-24;
					System.out.println(h2 + " " + m2);
				}
			}
		}
		
	}

}
