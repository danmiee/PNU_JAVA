package com.ruby.java_02_datauses;

import java.util.Scanner;

public class FallingObjectLocation {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float a = 9.81f;
		int t = in.nextInt();
		int v0 = 0;
		int x0 = 1000;
		
		float x = (float)(0.5*a*t*t)+(v0*t)+x0;
		
		System.out.printf("%d초 후 위치 : %3.2fm/s",t,x);
		
		in.close();
	}

}
