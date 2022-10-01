package baekjoon.step01.inoutncal;

import java.util.Scanner;

public class q12_multiplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>=100 && num1<1000) {
			if(num2>=100 && num2<1000) {
				for(int i=0; i<3; i++) {
					int r2 = (int)( num2 / (Math.pow(10, i) ) % 10);
							int r3 = num1 * r2;
							System.out.println(r3);
				}
				System.out.println(num1*num2);
			}
		}
	}

}
