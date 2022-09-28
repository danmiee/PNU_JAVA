package com.ruby.java.ch06;

public class StaticMethodTest {
/*
 * class method : static으로 정의된 method
 * print1(class method)과 print2(not class method)의 차이 
 */
	public static void main(String[] args) {
		StaticMethodTest.print1();
		print1();	// 객체가 있으나 마나 호출됨(고정된 값)
		//print2();	// static 아니므로 객체없어서 error
		StaticMethodTest s = new StaticMethodTest();
		s.print2();
		// 객체가 있으므로 호출 가능
	}

	public static void print1() {
		System.out.println("hello");
	}

	public void print2() {
		System.out.println("java");
	}
}
