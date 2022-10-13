package com.ruby.java_09_api;

public class Test01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		// hashCode : 인스턴스에 부여된 해시코드값 출력
			// 실행할 때마다 계산되는 값이 달라 실행결과 다를 수 있음
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		// getClass : 인스턴스의 정보를 가지는 Class 객체를 생성하여 반환
		Class c = obj1.getClass();
		
		// getName : 객체의 이름 반환
		System.out.println(c.getName());
		
		// toString 생략해도 동일한 결과 - 컴파일러가 자동호출
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		// MyObject 인스턴스 생성 후 obj4 변수 담고 출력
		MyObject obj4 = new MyObject(123);
		System.out.println(obj4);

		// .equals : 해시코드 같은지 비교
		MyObject obj5 = new MyObject(123);
		if(obj4.equals(obj5)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		// == : 참조변수값 비교
		if(obj4 == obj5) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		/*
		 * 생성자 선언 전 둘다 다른 객체라고 하였으나
		 * 생성자 선언 및 equals 오버라이딩 후 동일객체 / 다른객체로 나뉨
		 * == 은 equals 오버라이딩과 무관하게 참조변수값을 비교하고 obj4와 obj5는 서로 다른 인스턴스 주소값이 저장되었으므로 false
		 */
		
	}
	
}
