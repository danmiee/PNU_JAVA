package com.ruby.java_02_datauses;

import java.util.Scanner;

public class MultiplyDivide {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int a = x*y;		
		int b = (int)x/y;
		int c = x%y;
		
		System.out.printf("°ö : %d * %d = %d\n"
				+ "¸ò : %d / %d = %d\n"
				+ "³ª¸ÓÁö : %d - (%d * %d) = %d",
				x,y,a,x,y,b,x,y,b,c);
		
		in.close();
	}
}
