package com.ruby.java_09_api;

public class Test04 {

	public static void main(String[] args) {
		// 공백도 하나의 문자로 처리
		String s = "    Amy    ";
		int len1 = s.length();
		
		String s2 = s.trim();
		int len2 = s2.length();
		
		System.out.println(len1);
		System.out.println(len2);
		
		s = "";
		System.out.println(s.length());
		// null 문자열인지 판단할 때 사용
		System.out.println(s.isEmpty());
	}
}
