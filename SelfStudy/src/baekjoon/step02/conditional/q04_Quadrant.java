package baekjoon.step02.conditional;

import java.util.Scanner;

public class q04_Quadrant {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x!=0 && x>=-1000 && x<=1000) {
			if(y!=0 && y>=-1000 && y<=1000) {
				if(x>0) {
					if(y>0) {
						System.out.println("1");
					} else {
						System.out.println("4");
					}
				} else {
					if(y>0) {
						System.out.println("2");
					} else {
						System.out.println("3");
					}
				}
			}
		}
	}
}
