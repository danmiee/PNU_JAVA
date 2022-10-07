package com.ruby.java.ch14;

interface Multiply {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {

		// 람다식 구현
		Multiply m1,m2;
			// 변수선언
		m1 = () -> 3.14 * 2;
			/*
			 * m1=() : 익명클래스 및 객체 생성
			 * -> 이후
			 * 익명클래스의 메소드 바디 구현
			 * 
			 * ** 람다식은 인터페이스 내 메소드가 1개일 때만 사용 가능
			 */
		System.out.println(m1.getValue());

		m2 = () -> 10 * 3;
		System.out.println(m2.getValue());
	}
}
