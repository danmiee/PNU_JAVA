package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class TestResult_loop {

	public static String grade(int a) {
		if (a >= 95)	  return "A+";
		else if (a >= 90) return "A0";
		else if (a >= 85) return "B+";
		else if (a >= 80) return "B0";
		else if (a >= 75) return "C+";
		else if (a >= 70) return "C0";
		else if (a >= 65) return "D+";
		else if (a >= 60) return "D0";
		else			  return "F";
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		
		int a;
		
		while((a = in.nextInt()) != 0) {
			
			String grade = grade(a);
			System.out.printf("성적: %d점 / 학점: %s\n",a,grade);
			System.out.println("종료를 원하시면 0을 입력하세요.");
		}
		System.out.println("Good bye!!");
	}

}
