package com.ruby.java_09_api;

public class Test12 {

	public static void main(String[] args) {
		// 참조데이터와 기본데이터 연산 > Wrapper클래스는 내부적으로 기본 데이터로 변경되어 처리되기 때문에 가능
		int n1 = 10;
		Integer obj1 = n1;
		
		Integer obj2 = Integer.valueOf("20");
		int n2 = obj2;
		
		Integer obj3 = 30;
		
		int n3 = obj3 + 40;
		
		System.out.println(n1 + " : " + obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		
	}
}
