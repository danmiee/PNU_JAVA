package com.ruby.java.ch06;

public class StaticMethodTest2 {
	
	int num = 123;
	/*
	 * main 밖 : class의 data
	 * main 안 : 함수 내 로컬변수
	 */
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}

	public static void print1() {
	// static : 고정된 값으로 객체가 없어도 작동되어야 함
//		int num2 = num;
		// 객체값이 만들어질 때 들어가는 것이므로 먼저 작동하는 static에서 사용불가
		System.out.println("hello");
	}

	public void print2() {
		@SuppressWarnings("unused")
		int num3 = num;
		System.out.println("java");
	}
}
