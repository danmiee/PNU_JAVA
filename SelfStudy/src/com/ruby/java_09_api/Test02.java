package com.ruby.java_09_api;

public class Test02 {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1==s3) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		if(s2==s4) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		/*
		 * new 명령문 : 무조건 heap 메모리에 인스턴스 새로 생성하고 그 주소값이 참조변수에 저장
		 * "" : heap 메모리 내 String Pool 찾아감 > 동일한 문자열 가진 인스턴스 있으면 새로 생성하지 않고 기존 인스턴스 주소값 반환
		 */
		
		if(s1.equals(s3)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		if(s2.equals(s4)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		// equalsIgnoreCase : 대소문자 구분안함
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}
}
