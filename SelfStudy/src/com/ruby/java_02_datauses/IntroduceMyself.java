package com.ruby.java_02_datauses;

import java.util.Scanner;

public class IntroduceMyself {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		int yyyy = in.nextInt();
		int mm = in.nextInt();
		int dd = in.nextInt();
		double height = in.nextDouble();
		int weight = in.nextInt();
		String work = in.next();
		
		System.out.printf("이름 : %s\n",name);
//		System.out.println("생년월일 : "+yyyy+"년 "+mm+"월 "+dd+"일 ");
		System.out.printf("생년월일 : %d년 %d월 %d일\n",yyyy, mm, dd);
		System.out.println("키 : "+height);
		System.out.println("체중 : "+weight+"Kg");
		System.out.println("직업 : "+work);
		
		in.close();
	}
}
