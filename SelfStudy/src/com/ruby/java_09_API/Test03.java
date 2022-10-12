package com.ruby.java_09_API;

public class Test03 {

	public static void main(String[] args) {
		
		// String이 가지는 문자열은 내부적으로 char 타입의 배열로 처리됨 
		String s = "have a good day!";
		
		int length = s.length();
		System.out.println("총 글자 수 : " + length);
		char c;
		
		// charAt : 인자로 전달받은 인덱스에 해당하는 문자 추출
		for(int i=0; i<length; i++) {
			c = s.charAt(i);
			System.out.println(c);
		}
	}
}
