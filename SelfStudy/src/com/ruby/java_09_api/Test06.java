package com.ruby.java_09_api;

public class Test06 {

	public static void main(String[] args) {
		String s = "Everything is your world is created";
		
		// concat() : 새로운 문자열 추가
		String s2 = s.concat(" by what you think.");
		System.out.println(s2);
		
		// replace() : 기존 문자열 변경
		String s3 = s2.replaceAll("by what you think.", "by your thoughts.");
		System.out.println(s3);
		
		// toLowerCase() : 대문자 > 소문자
		// toUpperCase() : 소문자 > 대문자
		String s4 = s3.toLowerCase();
		String s5 = s3.toUpperCase();
		System.out.println(s4);
		System.out.println(s5);
				
	}
}
