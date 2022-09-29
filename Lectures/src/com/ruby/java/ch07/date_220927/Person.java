package com.ruby.java.ch07.date_220927;

public class Person {

	/*
	 * 생성자 선언 - 모든 클래스는 생성자가 반드시 존재하며 개발자가 명시하지 않으면 컴파일러가 내용이 비어있는 생성자를 자동 생성
	 */

	// 생성자 선언방법 예시
	/*
	 * public Person() { System.out.println("Person 생성자 실행!"); }
	 */

	// 자식클래스에 선언한 생성자 코드 중복 제거
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String name;
	private int age;

	// private으로 정의하였기 때문에 다른 클래스에서 가져오려면 getter, setter 필요
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 출력을 위한 toString 메소드 생성
	public String toString() {
		return name + ":" + age;
	}
}
