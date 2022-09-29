package com.ruby.java.ch07.date_220926.v1;

//	static 함수 알기

public class TestStatic {
	
	static void show() {
		System.out.println("Hello");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		show();
		// 같은 클래스기 때문에 클래스 생략 가능
		
		TestStatic.show();
		// static 함수 호출 정석
		
		/*
		 * class의 member가 아닌 method를 만들 필요가 있을 때
		 * 객체가 없어도 호출할 수 있는 static을 활용한다.
		 */
	}
	
}
