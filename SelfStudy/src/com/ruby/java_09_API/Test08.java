package com.ruby.java_09_API;

public class Test08 {

	public static void main(String[] args) {
		// valueOf() : 다양한 타입의 데이터를 String으로 변환
			// 오버로딩 되어있고 static으로 선언되어있어 String.valueOf() 형태로 사용 가능
		String s1 = String.valueOf(true);
		String s2 = String.valueOf('A');
		String s3 = String.valueOf(3.14);
		String s4 = String.valueOf(123);
		String s5 = String.valueOf(new MyObject(123));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
