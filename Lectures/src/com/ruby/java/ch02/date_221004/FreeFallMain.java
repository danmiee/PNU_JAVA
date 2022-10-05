package com.ruby.java.ch02.date_221004;

import java.util.Scanner;

public class FreeFallMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		final double g = 9.81;
//		int h=1000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("height(exit: -1): ");
		
		FreeFall ff = new FreeFall();
		int ht;
		
		while((ht=sc.nextInt()) != -1) {
			System.out.println("sec(exit: -1): ");
			int sec = sc.nextInt();
			
//		FreeFall ff = new FreeFall(1000);
			
			ff.setheight(ht);
			ff.setG(g);
			
			System.out.println(ff.getPosition(sec));
		}
		
		
	}
}
