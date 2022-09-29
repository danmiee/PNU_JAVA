package com.ruby.java.ch07.date_220927;

public class Student extends Person {

//생성자 선언
	/* 예시	
	public Studetn() {
			// 컴파일러가 super();를 자동으로 추가하여 부모클래스의 생성자도 함께 출력됨
			System.out.println("Studetn 생성자 실행!");
		}
	*/
	/*
	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
		System.out.println("Student(name,age,major) 생성자 실행!");
	}
	*/
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
		
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//overriding 구현
	// 부모클래스 메소드 호출
	/*
	public String toString () {
		return this.getName() + ":" + this.getAge() + ":" + major;
	}
	*/
	// toString 호출
	public String toString() {
		return super.toString() + ":" + major;
	}
}
