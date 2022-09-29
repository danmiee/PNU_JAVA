package com.ruby.java.ch07.date_220927;

public class Professor extends Person {

//생성자 선언
	/* 예시	
	public Professor() {
			// 컴파일러가 super();를 자동으로 추가하여 부모클래스의 생성자도 함께 출력됨
			System.out.println("Professor 생성자 실행!");
		}
	*/

	// 부모클래스의 인자값을 받는 매개변수가 선언된 생성자 선언
	/*
	public Professor(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행!");
	}
	*/
	
	// 부모클래스에서 중복제거함에 따른 생성자 선언
	public Professor(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	// overriding 구현
	// 부모클래스 메소드 호출
	/* getter setter 호출 
	public String toString() {
		return this.getName() + ":" + this.getAge() + ":" + subject;
	}
	*/
	// toString 호출
	public String toString() {
		return super.toString() + ":" + subject;
	}
 	
}
