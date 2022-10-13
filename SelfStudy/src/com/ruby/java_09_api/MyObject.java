package com.ruby.java_09_api;

public class MyObject {

	// toString 오버라이딩 - 메소드 선언부는 변경 불가
//	public String toString() {
//		return "MyObject";
//	}
	
	int num;
	
	// 생성자 선언
	MyObject(int num) {
		this.num = num;
	}

	// toString 오버라이딩
	public String toString() {
		return "MyObject";
	}
	
	// equals()메소드 오버라이딩 - 해시코드 값 외 다른 조건으로 비교
	public boolean equals(Object obj) {
		
		// 초기값 설정
		boolean result = false;
		MyObject arg = (MyObject) obj;
		
		// 현재 인스턴스의 num 값과 인자의 num 값 같으면 참
		if(this.num == arg.num) {
			result = true;
		}
		return result;
	}

}
