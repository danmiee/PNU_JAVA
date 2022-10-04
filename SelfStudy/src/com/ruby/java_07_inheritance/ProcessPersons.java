package com.ruby.java_07_inheritance;

/*
 * 교재를 참고하여 Person, Employee, Professor, Student 클래스 생성
 * 생성자, toString 선언
 * 0928 수업에서 main에 시행한 내용대로 코딩하기
 */

class Person {
	public Person() {
	}

	public Person(String name) {
		this.name = name;
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
	
	public void show() {
		System.out.println("name: " + name + " age: "+age);
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
	
	public void show() {
		super.show();
		System.out.println("dept: " + dept);
	}
}

class Professor extends Person {
	private String subject;

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String toString() {
		return super.toString() + " subject: " + subject;
	}
	
	public void show() {
		super.show();
		System.out.println("subject: " + subject);
	}

}

class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String toString() {
		return super.toString() + " major: " + major;
	}

	public void show() {
		super.show();
		System.out.println("major: " + major);
	}
	
}

public class ProcessPersons {

	// 동적바인딩 함수 위치!!
	static void display(Person[] p) {
		for(int i=0; i<5; i++) {
			p[i].show();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 생성자 overloading
		 * 객체배열 형성
		 * upcasting
		 */
		
		Person p = new Person();
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동",46);
//		System.out.println(p);
//		System.out.println(p1);
//		System.out.println(p2);
		
		Professor pf = new Professor("박철수",38,"선형대수");
		System.out.println(pf.toString());
		
		Student s = new Student("김영희",26,"수학");
		System.out.println(s.toString());
		
		Person list[] = new Person[5];
		
		list[0]=p; list[1]=p1; list[2]=p2; list[3]=pf; list[4]=s;
		
		display(list);
		
		
//		p.show();
//		System.out.println();
//		p1.show();
//		System.out.println();
//		p2.show();
//		System.out.println();
//		pf.show();
//		System.out.println();
//		s.show();
		
	}

}
