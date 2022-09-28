package com.ruby.java_07_hongsubject_ing;

/*
 * 교재를 참고하여 Person, Employee, Professor, Student 클래스 생성
 * 생성자, toString 선언
 * 0928 수업에서 main에 시행한 내용대로 코딩하기
 */

class Person {
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String toString() {
		return "name: " + name + " age: " + age;
	}
}

class Employee extends Person {
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + "dept: " + dept;
	}
}

class Professor extends Person {
	private String subject;

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + "subject: " + subject;
	}

}

class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + "major: " + major;
	}
}

public class ProcessPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성자 오버로딩, 객체배열(up casting 포함)
	}

}
