package com.ruby.java.ch06.date_220923;

class Count1 {
	public static int totalCount;
	int count;
}

public class StaticMethodTest3 {
	
	int num = 123;
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		@SuppressWarnings("unused")
		Count1 c = new Count1();
		/* 해당 패키지 내 정의된 class로 사용가능
		 * 정석적인 사용방법이나 class는 파일을 나눈 것이 가장 좋다.
		 */
		exam.print2();
	}

	public static void print1() {
//		int num2 = num;
		System.out.println("hello");
	}

	public void print2() {
		@SuppressWarnings("unused")
		int num;
//		num = num;
		// num(print2) = num(class) 라고 해주는 방법 배울예정
		System.out.println("java");
	}
}
