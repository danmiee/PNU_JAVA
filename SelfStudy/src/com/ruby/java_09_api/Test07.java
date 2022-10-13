package com.ruby.java_09_api;

public class Test07 {

	public static void main(String[] args) {
		
		String s = "한국,일본,중국,미국,독일,프랑스";
		
		// split() : 지정된 구분자로 문자열을 잘라 String[] 배열로 반환
		String[] list = s.split(",");
		// split("구분자",분리되는 문자열 개수)
		String[] list2 = s.split(",",2);
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("===============");
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("===============");
		
		String email = "purum@rubypaper.co.kr";
		int i = email.indexOf("@");

		// substring(문자 추출 시작 위치, 문자 추출 끝 위치+1)
		String id = email.substring(0,i);
		// substring() : 문자열 일부분만 추출할 때 사용
		String company = email.substring(i+1);
		System.out.println(id);
		System.out.println(company);
	}
}
